package com.base.utils;

public class Base64 {

	private static char[] Base64Code = new char[] { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M',
			'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h',
			'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2',
			'3', '4', '5', '6', '7', '8', '9', '+', '/' };
	private static byte[] Base64Decode = new byte[] { (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1,
			(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1,
			(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1,
			(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1,
			(byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1,
			(byte) -1, (byte) 62, (byte) -1, (byte) 63, (byte) -1, (byte) 63, (byte) 52, (byte) 53, (byte) 54,
			(byte) 55, (byte) 56, (byte) 57, (byte) 58, (byte) 59, (byte) 60, (byte) 61, (byte) -1, (byte) -1,
			(byte) -1, (byte) 0, (byte) -1, (byte) -1, (byte) -1, (byte) 0, (byte) 1, (byte) 2, (byte) 3, (byte) 4,
			(byte) 5, (byte) 6, (byte) 7, (byte) 8, (byte) 9, (byte) 10, (byte) 11, (byte) 12, (byte) 13, (byte) 14,
			(byte) 15, (byte) 16, (byte) 17, (byte) 18, (byte) 19, (byte) 20, (byte) 21, (byte) 22, (byte) 23,
			(byte) 24, (byte) 25, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) -1, (byte) 26,
			(byte) 27, (byte) 28, (byte) 29, (byte) 30, (byte) 31, (byte) 32, (byte) 33, (byte) 34, (byte) 35,
			(byte) 36, (byte) 37, (byte) 38, (byte) 39, (byte) 40, (byte) 41, (byte) 42, (byte) 43, (byte) 44,
			(byte) 45, (byte) 46, (byte) 47, (byte) 48, (byte) 49, (byte) 50, (byte) 51, (byte) -1, (byte) -1,
			(byte) -1, (byte) -1, (byte) -1 };

	private Base64() {
	}

	public static String encode(byte[] byteArr) {
		int code = 0;
		StringBuffer sb = new StringBuffer((byteArr.length - 1) / 3 << 6);

		for (int i = 0; i < byteArr.length; ++i) {
			code |= byteArr[i] << 16 - i % 3 * 8 & 255 << 16 - i % 3 * 8;
			if (i % 3 == 2 || i == byteArr.length - 1) {
				sb.append(Base64Code[(code & 16515072) >>> 18]);
				sb.append(Base64Code[(code & 258048) >>> 12]);
				sb.append(Base64Code[(code & 4032) >>> 6]);
				sb.append(Base64Code[code & 63]);
				code = 0;
			}
		}

		if (byteArr.length % 3 > 0) {
			sb.setCharAt(sb.length() - 1, '=');
		}

		if (byteArr.length % 3 == 1) {
			sb.setCharAt(sb.length() - 2, '=');
		}

		return sb.toString();
	}

	public static byte[] decode(String code) {
		if (code == null) {
			return null;
		} else {
			int len = code.length();
			if (len % 4 != 0) {
				throw new IllegalArgumentException("Base64 string length must be 4*n");
			} else if (code.length() == 0) {
				return new byte[0];
			} else {
				int pad = 0;
				if (code.charAt(len - 1) == 61) {
					++pad;
				}

				if (code.charAt(len - 2) == 61) {
					++pad;
				}

				int retLen = len / 4 * 3 - pad;
				byte[] ret = new byte[retLen];

				for (int i = 0; i < len; i += 4) {
					int j = i / 4 * 3;
					char ch1 = code.charAt(i);
					char ch2 = code.charAt(i + 1);
					char ch3 = code.charAt(i + 2);
					char ch4 = code.charAt(i + 3);
					int tmp = Base64Decode[ch1] << 18 | Base64Decode[ch2] << 12 | Base64Decode[ch3] << 6
							| Base64Decode[ch4];
					ret[j] = (byte) ((tmp & 16711680) >> 16);
					if (i < len - 4) {
						ret[j + 1] = (byte) ((tmp & '\uff00') >> 8);
						ret[j + 2] = (byte) (tmp & 255);
					} else {
						if (j + 1 < retLen) {
							ret[j + 1] = (byte) ((tmp & '\uff00') >> 8);
						}

						if (j + 2 < retLen) {
							ret[j + 2] = (byte) (tmp & 255);
						}
					}
				}

				return ret;
			}
		}
	}
}
