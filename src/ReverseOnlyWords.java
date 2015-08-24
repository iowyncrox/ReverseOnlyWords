public class ReverseOnlyWords {

	public static String reverse(String str) {

		if (str == null || str.length() <= 1) {
			return "";
		}

		String[] stringArray = str.split(" ");
		StringBuilder sb = new StringBuilder();
		for (int i = stringArray.length - 1; i >= 0; --i) {
			if (i != 0) {
				sb.append(stringArray[i]).append(" ");
			} else if (i == 0) {
				sb.append(stringArray[i]);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(ReverseOnlyWords.reverse("the sky is blue"));
	}
}
