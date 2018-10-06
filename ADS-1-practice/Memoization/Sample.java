public class Sample {

	public static String endX(String str) {
		if (str.length() == 0) {
			return str;
		}
		if (str.charAt(0) == 'x') {
			return endX(str.substring(1)) + 'x';
		} else {
			return str.charAt(0) + endX(str.substring(1));
		}
	}
	public static void main(String[] args) {
		System.out.println(endX("xxre"));
		System.out.println(endX("xxhixx"));
		System.out.println(endX("xx"));
		System.out.println(endX("bxx"));
		System.out.println(endX("bxax"));
	}
}