package com.base.utils;

import com.rdc.kingsa.input.common.pslog.PsLog;
import com.rdc.kingsa.input.common.pslog.developerlog.DeveloperLogRecord;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;


public class MD5 {
	static final char[] HEX = new char[] { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e',
			'f' };
	static final int S11 = 7;
	static final int S12 = 12;
	static final int S13 = 17;
	static final int S14 = 22;
	static final int S21 = 5;
	static final int S22 = 9;
	static final int S23 = 14;
	static final int S24 = 20;
	static final int S31 = 4;
	static final int S32 = 11;
	static final int S33 = 16;
	static final int S34 = 23;
	static final int S41 = 6;
	static final int S42 = 10;
	static final int S43 = 15;
	static final int S44 = 21;
	static final byte[] PADDING = new byte[64];

	public MD5() {
	}

	public static String md5(File file) {
		String md5String = "";
		FileInputStream fins = null;
		BufferedInputStream buffins = null;

		try {
			fins = new FileInputStream(file);
			buffins = new BufferedInputStream(fins);
			int e1 = buffins.available();
			byte[] bArray = new byte[e1];
			buffins.read(bArray);
			MD5 md5 = new MD5();
			byte[] digest = md5.toDigest(bArray);
			StringBuffer sb = new StringBuffer(15);

			for (int i = 0; i < digest.length; ++i) {
				sb.append(HEX[md5.byte2int(digest[i]) / 16]);
				sb.append(HEX[md5.byte2int(digest[i]) % 16]);
			}

			md5String = sb.toString();
		} catch (FileNotFoundException e) {
			printlog("Could not find the file: " + file.getAbsolutePath(), e);
		} catch (Exception e) {
			printlog("Caught an unexpected exception in crc32: " + e.getMessage(), e);
		} finally {
			try {
				if (null != fins) {
					fins.close();
				}

				if (null != buffins) {
					buffins.close();
				}
			} catch (IOException e) {
				printlog("", e);
			}

		}

		return md5String;
	}

	public String toDigest(String string) {
		byte[] digest = this.toDigest(string.getBytes());
		StringBuffer sb = new StringBuffer(15);

		for (int i = 0; i < digest.length; ++i) {
			sb.append(HEX[this.byte2int(digest[i]) / 16]);
			sb.append(HEX[this.byte2int(digest[i]) % 16]);
		}

		return sb.toString();
	}

	public byte[] toDigest(byte[] string) {
		MD5.MD5_CTX context = new MD5.MD5_CTX();
		byte[] digest = new byte[16];
		int len = string.length;
		this.MD5Init(context);
		this.MD5Update(context, string, len);
		this.MD5Final(digest, context);
		return digest;
	}

	long fix(long l) {
		return l & 4294967295L;
	}

	long F(long x, long y, long z) {
		return this.fix(x & y | ~x & z);
	}

	long G(long x, long y, long z) {
		return this.fix(x & z | y & ~z);
	}

	long H(long x, long y, long z) {
		return this.fix(x ^ y ^ z);
	}

	long I(long x, long y, long z) {
		return this.fix(y ^ (x | ~z));
	}

	long ROTATE_LEFT(long x, long n) {
		return this.fix(x << (int) n | x >> (int) (32L - n));
	}

	void FF(long[] n, int a, int b, int c, int d, long x, long s, long ac) {
		n[a] += this.F(n[b], n[c], n[d]) + x + ac;
		n[a] = this.ROTATE_LEFT(this.fix(n[a]), s);
		n[a] += n[b];
		n[a] = this.fix(n[a]);
	}

	void GG(long[] n, int a, int b, int c, int d, long x, long s, long ac) {
		n[a] += this.G(n[b], n[c], n[d]) + x + ac;
		n[a] = this.ROTATE_LEFT(this.fix(n[a]), s);
		n[a] += n[b];
		n[a] = this.fix(n[a]);
	}

	void HH(long[] n, int a, int b, int c, int d, long x, long s, long ac) {
		n[a] += this.H(n[b], n[c], n[d]) + x + ac;
		n[a] = this.ROTATE_LEFT(this.fix(n[a]), s);
		n[a] += n[b];
		n[a] = this.fix(n[a]);
	}

	void II(long[] n, int a, int b, int c, int d, long x, long s, long ac) {
		n[a] += this.I(n[b], n[c], n[d]) + x + ac;
		n[a] = this.ROTATE_LEFT(this.fix(n[a]), s);
		n[a] += n[b];
		n[a] = this.fix(n[a]);
	}

	void MD5Init(MD5.MD5_CTX context) {
		context.count[0] = context.count[1] = 0L;
		context.state[0] = 1732584193L;
		context.state[1] = 4023233417L;
		context.state[2] = 2562383102L;
		context.state[3] = 271733878L;
	}

	void MD5Update(MD5.MD5_CTX context, byte[] input, int inputLen) {
		int index = (int) (context.count[0] >> 3 & 63L);
		long[] var10001 = context.count;
		if (this.fix(var10001[0] += (long) inputLen << 3) < this.fix((long) inputLen << 3)) {
			++context.count[1];
		}

		long[] var10000 = context.count;
		var10000[1] += (long) inputLen >> 29;
		context.count[1] = this.fix(context.count[1]);
		int partLen = 64 - index;
		int i;
		if (inputLen >= partLen) {
			this.MD5_memcpy(context.buffer, index, input, 0, partLen);
			this.MD5Transform(context.state, context.buffer, 0);

			for (i = partLen; i + 63 < inputLen; i += 64) {
				this.MD5Transform(context.state, input, i);
			}

			index = 0;
		} else {
			i = 0;
		}

		this.MD5_memcpy(context.buffer, index, input, i, inputLen - i);
	}

	void MD5Final(byte[] digest, MD5.MD5_CTX context) {
		byte[] bits = new byte[8];
		this.Encode(bits, context.count, 8);
		int index = (int) (context.count[0] >> 3 & 63L);
		int padLen = index < 56 ? 56 - index : 120 - index;
		this.MD5Update(context, PADDING, padLen);
		this.MD5Update(context, bits, 8);
		this.Encode(digest, context.state, 16);
	}

	void MD5Transform(long[] state, byte[] block, int idx) {
		long[] buf = new long[4];
		System.arraycopy(state, 0, buf, 0, 4);
		long[] x = new long[16];
		this.Decode(x, block, idx, 64);
		this.FF(buf, 0, 1, 2, 3, x[0], 7L, 3614090360L);
		this.FF(buf, 3, 0, 1, 2, x[1], 12L, 3905402710L);
		this.FF(buf, 2, 3, 0, 1, x[2], 17L, 606105819L);
		this.FF(buf, 1, 2, 3, 0, x[3], 22L, 3250441966L);
		this.FF(buf, 0, 1, 2, 3, x[4], 7L, 4118548399L);
		this.FF(buf, 3, 0, 1, 2, x[5], 12L, 1200080426L);
		this.FF(buf, 2, 3, 0, 1, x[6], 17L, 2821735955L);
		this.FF(buf, 1, 2, 3, 0, x[7], 22L, 4249261313L);
		this.FF(buf, 0, 1, 2, 3, x[8], 7L, 1770035416L);
		this.FF(buf, 3, 0, 1, 2, x[9], 12L, 2336552879L);
		this.FF(buf, 2, 3, 0, 1, x[10], 17L, 4294925233L);
		this.FF(buf, 1, 2, 3, 0, x[11], 22L, 2304563134L);
		this.FF(buf, 0, 1, 2, 3, x[12], 7L, 1804603682L);
		this.FF(buf, 3, 0, 1, 2, x[13], 12L, 4254626195L);
		this.FF(buf, 2, 3, 0, 1, x[14], 17L, 2792965006L);
		this.FF(buf, 1, 2, 3, 0, x[15], 22L, 1236535329L);
		this.GG(buf, 0, 1, 2, 3, x[1], 5L, 4129170786L);
		this.GG(buf, 3, 0, 1, 2, x[6], 9L, 3225465664L);
		this.GG(buf, 2, 3, 0, 1, x[11], 14L, 643717713L);
		this.GG(buf, 1, 2, 3, 0, x[0], 20L, 3921069994L);
		this.GG(buf, 0, 1, 2, 3, x[5], 5L, 3593408605L);
		this.GG(buf, 3, 0, 1, 2, x[10], 9L, 38016083L);
		this.GG(buf, 2, 3, 0, 1, x[15], 14L, 3634488961L);
		this.GG(buf, 1, 2, 3, 0, x[4], 20L, 3889429448L);
		this.GG(buf, 0, 1, 2, 3, x[9], 5L, 568446438L);
		this.GG(buf, 3, 0, 1, 2, x[14], 9L, 3275163606L);
		this.GG(buf, 2, 3, 0, 1, x[3], 14L, 4107603335L);
		this.GG(buf, 1, 2, 3, 0, x[8], 20L, 1163531501L);
		this.GG(buf, 0, 1, 2, 3, x[13], 5L, 2850285829L);
		this.GG(buf, 3, 0, 1, 2, x[2], 9L, 4243563512L);
		this.GG(buf, 2, 3, 0, 1, x[7], 14L, 1735328473L);
		this.GG(buf, 1, 2, 3, 0, x[12], 20L, 2368359562L);
		this.HH(buf, 0, 1, 2, 3, x[5], 4L, 4294588738L);
		this.HH(buf, 3, 0, 1, 2, x[8], 11L, 2272392833L);
		this.HH(buf, 2, 3, 0, 1, x[11], 16L, 1839030562L);
		this.HH(buf, 1, 2, 3, 0, x[14], 23L, 4259657740L);
		this.HH(buf, 0, 1, 2, 3, x[1], 4L, 2763975236L);
		this.HH(buf, 3, 0, 1, 2, x[4], 11L, 1272893353L);
		this.HH(buf, 2, 3, 0, 1, x[7], 16L, 4139469664L);
		this.HH(buf, 1, 2, 3, 0, x[10], 23L, 3200236656L);
		this.HH(buf, 0, 1, 2, 3, x[13], 4L, 681279174L);
		this.HH(buf, 3, 0, 1, 2, x[0], 11L, 3936430074L);
		this.HH(buf, 2, 3, 0, 1, x[3], 16L, 3572445317L);
		this.HH(buf, 1, 2, 3, 0, x[6], 23L, 76029189L);
		this.HH(buf, 0, 1, 2, 3, x[9], 4L, 3654602809L);
		this.HH(buf, 3, 0, 1, 2, x[12], 11L, 3873151461L);
		this.HH(buf, 2, 3, 0, 1, x[15], 16L, 530742520L);
		this.HH(buf, 1, 2, 3, 0, x[2], 23L, 3299628645L);
		this.II(buf, 0, 1, 2, 3, x[0], 6L, 4096336452L);
		this.II(buf, 3, 0, 1, 2, x[7], 10L, 1126891415L);
		this.II(buf, 2, 3, 0, 1, x[14], 15L, 2878612391L);
		this.II(buf, 1, 2, 3, 0, x[5], 21L, 4237533241L);
		this.II(buf, 0, 1, 2, 3, x[12], 6L, 1700485571L);
		this.II(buf, 3, 0, 1, 2, x[3], 10L, 2399980690L);
		this.II(buf, 2, 3, 0, 1, x[10], 15L, 4293915773L);
		this.II(buf, 1, 2, 3, 0, x[1], 21L, 2240044497L);
		this.II(buf, 0, 1, 2, 3, x[8], 6L, 1873313359L);
		this.II(buf, 3, 0, 1, 2, x[15], 10L, 4264355552L);
		this.II(buf, 2, 3, 0, 1, x[6], 15L, 2734768916L);
		this.II(buf, 1, 2, 3, 0, x[13], 21L, 1309151649L);
		this.II(buf, 0, 1, 2, 3, x[4], 6L, 4149444226L);
		this.II(buf, 3, 0, 1, 2, x[11], 10L, 3174756917L);
		this.II(buf, 2, 3, 0, 1, x[2], 15L, 718787259L);
		this.II(buf, 1, 2, 3, 0, x[9], 21L, 3951481745L);

		for (int i = 0; i < 4; ++i) {
			state[i] = this.fix(state[i] + buf[i]);
		}

	}

	void Encode(byte[] output, long[] input, int len) {
		int i = 0;

		for (int j = 0; j < len; j += 4) {
			output[j] = (byte) ((int) (input[i] & 255L));
			output[j + 1] = (byte) ((int) (input[i] >> 8 & 255L));
			output[j + 2] = (byte) ((int) (input[i] >> 16 & 255L));
			output[j + 3] = (byte) ((int) (input[i] >> 24 & 255L));
			++i;
		}

	}

	void Decode(long[] output, byte[] input, int iidx, int len) {
		int i = 0;

		for (int j = 0; j < len; j += 4) {
			output[i] = this.byte2int(input[iidx + j]) | (long) this.byte2int(input[iidx + j + 1]) << 8
					| (long) this.byte2int(input[iidx + j + 2]) << 16 | (long) this.byte2int(input[iidx + j + 3]) << 24;
			++i;
		}

	}

	void MD5_memcpy(byte[] output, int oidx, byte[] input, int iidx, int len) {
		for (int i = 0; i < len; ++i) {
			output[oidx + i] = input[iidx + i];
		}

	}

	int byte2int(byte b) {
		return b < 0 ? b + 256 : b;
	}

	static {
		PADDING[0] = -128;

		for (int i = 1; i < PADDING.length; ++i) {
			PADDING[i] = 0;
		}

	}

	static class MD5_CTX {
		private long[] state = new long[4];
		private long[] count = new long[2];
		private byte[] buffer = new byte[64];

		MD5_CTX() {
		}
	}

	static void printlog(String message, Throwable t) {
		DeveloperLogRecord record = new DeveloperLogRecord("", "", message);
		PsLog.DEVELOPER.error(record, t);
	}
}
