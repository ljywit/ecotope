package com.base.utils;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Collection;
import java.util.Iterator;

/**
 * 数字工具:主要用于double ,BigDecimal的操作,集合的求和及平均值等操作
 * 
 */
public class MathUtil {

	/**
	 * 默认精度
	 */
	private static final int DEF_DECIMAL_SCALE = 5;

	/**
	 * 在指定范围内[min,max)取随机整数
	 * 
	 * @param min 下界
	 * @param max 上界
	 * @return 随机数
	 */
	public static int getRandomInt(int min, int max) {
		int gap = max - min;
		return (int) (Math.random() * gap) + min;
	}

	/**
	 * 对集合求和,集合为null, size==0该方法都返回null 集合中的null的元素会被忽略
	 * 
	 * @param collection collection
	 * @return BigDecimal
	 */
	public static BigDecimal sum(Collection<Number> collection) {
		if (collection == null || collection.size() == 0) {
			return null;
		}
		Iterator<Number> iterator = collection.iterator();
		BigDecimal result = null;
		while (iterator.hasNext()) {
			Number raw = iterator.next();
			if (raw == null) {
				continue;
			}
			BigDecimal next = new BigDecimal(raw.toString());
			if (result == null) {
				result = next;
			} else {
				result = result.add(new BigDecimal(next.toString()));
			}
		}
		return result;
	}

	/**
	 * 对集合求平均值,集合为null, size==0该方法都返回null 集合中的null的元素会被忽略
	 * 
	 * @param collection collection
	 * @return BigDecimal
	 */
	public static BigDecimal average(Collection<Number> collection) {
		if (collection == null || collection.size() == 0) {
			return null;
		}
		Iterator<Number> iterator = collection.iterator();
		BigDecimal sum = null;
		int notNullSize = 0;
		while (iterator.hasNext()) {
			Number raw = iterator.next();
			if (raw == null) {
				continue;
			}
			BigDecimal next = new BigDecimal(raw.toString());
			if (sum == null) {
				sum = next;
			} else {
				sum = sum.add(new BigDecimal(next.toString()));
			}
			notNullSize++;
		}
		if (notNullSize == 0) {
			return null;
		}
		return sum.divide(new BigDecimal(notNullSize));
	}

	/**
	 * 取集合最小值,集合为null, size==0该方法都返回null 集合中的null的元素会被忽略
	 * 
	 * @param collection collection
	 * @return BigDecimal
	 */
	public static BigDecimal min(Collection<Number> collection) {
		if (collection == null || collection.size() == 0) {
			return null;
		}
		Iterator<Number> iterator = collection.iterator();
		BigDecimal result = null;
		while (iterator.hasNext()) {
			Number raw = iterator.next();
			if (raw == null) {
				continue;
			}
			BigDecimal next = new BigDecimal(raw.toString());
			if (result == null || next.compareTo(result) < 0) {
				result = next;
			}
		}
		return result;
	}

	/**
	 * 取集合最大值,集合为null, size==0 该方法都返回null 集合中的null的元素会被忽略
	 * 
	 * @param collection collection
	 * @return BigDecimal
	 */
	public static BigDecimal max(Collection<Number> collection) {
		if (collection == null || collection.size() == 0) {
			return null;
		}
		Iterator<Number> iterator = collection.iterator();
		BigDecimal result = null;
		while (iterator.hasNext()) {
			Number raw = iterator.next();
			if (raw == null) {
				continue;
			}
			BigDecimal next = new BigDecimal(raw.toString());
			if (result == null || next.compareTo(result) > 0) {
				result = next;
			}
		}
		return result;
	}

	/**
	 * 取数组最大值,支持 Integer,Long,Double,BigDecimal
	 * null值直接忽略
	 *
	 * @param <T> 泛型
	 * @param numbers 数组
	 * @return Number
	 */
	public static <T extends Number> T max(T... numbers) {
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		T result = null;
		for (T number : numbers) {
			if (number == null) {
				continue;
			}
			if (isValidNumber(number)) {
				if (compareTo(number, result) > 0) {
					result = number;
				}
			} else {
				throw new IllegalArgumentException("Number is not valid type");
			}
		}
		return result;
	}

	/**
	 * 取数组最小值,支持 Integer,Long,Double,BigDecimal null值直接忽略
	 *
	 * @param <T> 泛型
	 * @param numbers 数组
	 * @return Number
	 */
	public static <T extends Number> T min(T... numbers) {
		if (numbers == null || numbers.length == 0) {
			return null;
		}
		T result = null;
		for (T number : numbers) {
			if (number == null) {
				continue;
			}
			if (isValidNumber(number)) {
				if (result == null || compareTo(number, result) < 0) {
					result = number;
				}
			} else {
				throw new IllegalArgumentException("Number is not valid type");
			}
		}
		return result;
	}

	private static <T extends Number> int compareTo(T number1, T number2) {
		if (number1 == null && number2 == null) {
			return 0;
		} else if (number1 == null) {
			return -1;
		} else if (number2 == null) {
			return 1;
		}
		if (number1 instanceof Integer) {
			return ((Integer) number1).compareTo((Integer) number2);
		} else if (number1 instanceof Long) {
			return ((Long) number1).compareTo((Long) number2);
		} else if (number1 instanceof Double) {
			return ((Double) number1).compareTo((Double) number2);
		} else if (number1 instanceof BigDecimal) {
			return ((BigDecimal) number1).compareTo((BigDecimal) number2);
		} else {
			throw new IllegalArgumentException("Illegal type number.");
		}
	}

	private static <T extends Number> boolean isValidNumber(T number) {
		return number instanceof Double || number instanceof Integer || number instanceof BigDecimal
				|| number instanceof Long;
	}

	/**
	 * double 加法
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @return double
	 */
	public static double add(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(new Double(v1).toString());
		BigDecimal b2 = new BigDecimal(new Double(v2).toString());
		return b1.add(b2).doubleValue();
	}

	/**
	 * 加法
	 * 
	 * @param a1 Integer
	 * @param a2 Integer
	 * @param retNullWhenNull boolean
	 * @return Integer
	 */
	public static Integer add(Integer a1, Integer a2, boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (a1 == null && a2 == null) {
				return null;
			}
		}
		if (a1 == null) {
			a1 = new Integer(0);
		}
		if (a2 == null) {
			a2 = new Integer(0);
		}
		return new Integer(a1.intValue() + a2.intValue());
	}

	/**
	 * 加法
	 * 
	 * @param a1 Long
	 * @param a2 Long
	 * @param retNullWhenNull boolean
	 * @return Long
	 */
	public static Long add(Long a1, Long a2, boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (a1 == null && a2 == null) {
				return null;
			}
		}
		if (a1 == null) {
			a1 = new Long(0);
		}
		if (a2 == null) {
			a2 = new Long(0);
		}
		return new Long(a1.longValue() + a2.longValue());
	}

	/**
	 * double 减法
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @return double
	 */
	public static double subtract(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(new Double(v1).toString());
		BigDecimal b2 = new BigDecimal(new Double(v2).toString());
		return b1.subtract(b2).doubleValue();
	}

	/**
	 * 减法
	 * 
	 * @param a1 Integer
	 * @param a2 Integer
	 * @param retNullWhenNull 是否返回null
	 * @return Integer
	 */
	public static Integer subtract(Integer a1, Integer a2, boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (a1 == null && a2 == null) {
				return null;
			}
		}
		if (a1 == null) {
			a1 = new Integer(0);
		}
		if (a2 == null) {
			a2 = new Integer(0);
		}
		return new Integer(a1.intValue() - a2.intValue());

	}

	/**
	 * double 乘法
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @return double
	 */
	public static double multiply(double v1, double v2) {
		BigDecimal b1 = new BigDecimal(new Double(v1).toString());
		BigDecimal b2 = new BigDecimal(new Double(v2).toString());
		return b1.multiply(b2).doubleValue();
	}

	/**
	 * double 除法，默认2位有效数字
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @return double
	 */
	public static double divide(double v1, double v2) {
		return divide(v1, v2, DEF_DECIMAL_SCALE);
	}

	/**
	 * double 除法,允许设置精度
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @param scale 精度
	 * @return double
	 */
	public static double divide(double v1, double v2, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		return divide(v1, v2, scale, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * double 除法,允许设置精度，取近似值方式
	 * 
	 * @param v1 v1
	 * @param v2 v2
	 * @param scale scale
	 * @param roundingMode roundingMode
	 * @see BigDecimal#ROUND_HALF_UP etc.
	 * @return double
	 */
	public static double divide(double v1, double v2, int scale, int roundingMode) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b1 = new BigDecimal(new Double(v1).toString());
		BigDecimal b2 = new BigDecimal(new Double(v2).toString());
		return divide(b1, b2, scale, roundingMode).doubleValue();
	}

	/**
	 * 加
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param retNullWhenNull boolean
	 * @return BigDecimal
	 */
	public static BigDecimal add(BigDecimal b1, BigDecimal b2, boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (b1 == null && b2 == null) {
				return null;
			}
		}
		if (b1 == null) {
			b1 = new BigDecimal(0);
		}
		if (b2 == null) {
			b2 = new BigDecimal(0);
		}

		return b1.add(b2);
	}

	/**
	 * BigDecimal
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param retNullWhenNull boolean
	 * @return BigDecimal
	 */
	public static BigDecimal subtract(BigDecimal b1, BigDecimal b2, boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (b1 == null && b2 == null) {
				return null;
			}
		}
		if (b1 == null) {
			b1 = new BigDecimal(0);
		}
		if (b2 == null) {
			b2 = new BigDecimal(0);
		}

		return b1.subtract(b2);
	}

	/**
	 * 乘法
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param retNullWhenNull 是否返回null，当空的时候
	 * @return BigDecimal
	 */
	public static BigDecimal multiply(BigDecimal b1, BigDecimal b2, boolean... retNullWhenNull) {
		return multiply(b1, b2, DEF_DECIMAL_SCALE, retNullWhenNull);
	}

	/**
	 * 乘法
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param scale 小数位数
	 * @param retNullWhenNull 是否返回null，当空的时候
	 * @return BigDecimal
	 */
	public static BigDecimal multiply(BigDecimal b1, BigDecimal b2, int scale, boolean... retNullWhenNull) {
		return multiply(b1, b2, scale, BigDecimal.ROUND_HALF_UP, retNullWhenNull);
	}

	/**
	 * 乘法
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param scale 小数位数
	 * @param roundingMode 规则
	 * @param retNullWhenNull 是否返回null，当空的时候
	 * @return BigDecimal
	 */
	public static BigDecimal multiply(BigDecimal b1, BigDecimal b2, int scale, int roundingMode,
			boolean... retNullWhenNull) {
		if (retNullWhenNull != null && retNullWhenNull.length != 0 && retNullWhenNull[0]) {
			if (b1 == null && b2 == null) {
				return null;
			}
		}
		if (b1 == null) {
			b1 = BigDecimal.ZERO;
		}
		if (b2 == null) {
			b2 = BigDecimal.ZERO;
		}
		return b1.multiply(b2).divide(BigDecimal.ONE, scale, roundingMode);
	}

	/**
	 * double 取近似值
	 * 
	 * @param v v
	 * @param scale 精度
	 * @return double
	 */
	public static double round(double v, int scale) {
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		BigDecimal b = new BigDecimal(v);
		return round(b, scale).doubleValue();
	}

	/**
	 * 将double进行格式化,pattern可以传入null
	 * 
	 * @see #formatDecimal(BigDecimal, String)
	 * @param input 输入参数
	 * @param pattern 格式
	 * @return 格式化后的字符串
	 */
	public static String formatDouble(double input, String pattern) {
		if (StringUtil.isEmpty(pattern)) {
			pattern = "###0.##";
		}
		return new DecimalFormat(pattern).format(input);
	}

	/**
	 * 除
	 * 
	 * @param b1 BigDecimal
	 * @param b2 BigDecimal
	 * @param retNullWhenNull boolean
	 * @return BigDecimal
	 */
	public static BigDecimal divide(BigDecimal b1, BigDecimal b2, boolean... retNullWhenNull) {
		return divide(b1, b2, DEF_DECIMAL_SCALE, retNullWhenNull);
	}

	/**
	 * BigDecimal除法，可设置值的精度（四舍五入）
	 * 
	 * @param b1 b1
	 * @param b2 b2
	 * @param scale 精度
	 * @param retNullWhenNull boolean
	 * @return BigDecimal
	 */
	public static BigDecimal divide(BigDecimal b1, BigDecimal b2, int scale, boolean... retNullWhenNull) {
		return divide(b1, b2, scale, BigDecimal.ROUND_HALF_UP, retNullWhenNull);
	}

	/**
	 * BigDecimal除法，可设置值的精度及取近似值的方式
	 * 
	 * @param b1 b1
	 * @param b2 b2
	 * @param scale 精度
	 * @param roundingMode 取近似值的方式
	 * @param retNullWhenNull boolean
	 * @return BigDecimal
	 */
	public static BigDecimal divide(BigDecimal b1, BigDecimal b2, int scale, int roundingMode,
			boolean... retNullWhenNull) {
		BigDecimal result = null;
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}

		if (b1 != null && b2 != null) {
			result = b1.divide(b2, scale, roundingMode);
		} else if (b1 == null) {
			if (retNullWhenNull == null || retNullWhenNull.length == 0 || !retNullWhenNull[0]) {
				result = new BigDecimal(0);
			}
		} else if (b2 == null) {
			throw new IllegalArgumentException("The divisor should not be null");
		}
		return result;
	}

	/**
	 * BigDecimal 四舍五入
	 * 
	 * @param decimal 小数
	 * @param scale 小数精度
	 * @return BigDecimal
	 */
	public static BigDecimal round(BigDecimal decimal, int scale) {
		if (decimal == null) {
			return null;
		}
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		return round(decimal, scale, BigDecimal.ROUND_HALF_UP);
	}

	/**
	 * BigDecimal 取近似值
	 * 
	 * @param decimal 小数
	 * @param scale 小数精度
	 * @param roundingMode 取近似值方式
	 * @return BigDecimal
	 */
	public static BigDecimal round(BigDecimal decimal, int scale, int roundingMode) {
		if (decimal == null) {
			return null;
		}
		if (scale < 0) {
			throw new IllegalArgumentException("The scale must be a positive integer or zero");
		}
		return decimal.divide(BigDecimal.ONE, scale, roundingMode);
	}

	/**
	 * 格式化为字符串 当#在最前端或是最后端，且其对应的数字为0，则0不显示;如果用0做pattern则其对应的数字一定显示，该位没有值也会显示0
	 * 00123.12 用 #,##0.0 显示为 123.1 用 0000.0 显示为 0123.1 用 #0.000 显示为 123.120
	 * 
	 * @param input input
	 * @param pattern pattern
	 * @return String
	 */
	public static String formatDecimal(BigDecimal input, String pattern) {
		if (input == null) {
			return null;
		}
		if (StringUtil.isEmpty(pattern)) {
			pattern = "#,##0.##";
		}
		return new DecimalFormat(pattern).format(input);
	}
}
