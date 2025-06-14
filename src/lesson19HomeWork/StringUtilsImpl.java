package lesson19HomeWork;

import java.util.ArrayList;

public class StringUtilsImpl implements StringUtils {

    @Override
    public double div(String number1, String number2) throws NullPointerException, NumberFormatException, ArithmeticException {
        if (number1 == null || number2 == null) {
            throw new NullPointerException("Arguments cannot be null");
        }

        double num1 = Double.parseDouble(number1);
        double num2 = Double.parseDouble(number2);

        if (num2 == 0) {
            throw new ArithmeticException("Division by zero");
        }

        return num1 / num2;
    }

    @Override
    public int[] findWord(String text, String word) throws NullPointerException {
        if (text == null || word == null) {
            throw new NullPointerException("Arguments cannot be null");
        }

        if (!text.contains(word) || word.isEmpty()) {
            return new int[0];
        }

        StringBuilder textBuilder = new StringBuilder(text);
        StringBuilder lineIndex = new StringBuilder();

        while (textBuilder.indexOf(word) != -1) {
            int index = textBuilder.indexOf(word);
            lineIndex.append(index).append(" ");
            textBuilder.replace(index, index + word.length(), "*".repeat(word.length()));
        }

        String[] indexes = lineIndex.toString().split(" ");
        int[] result = new int[indexes.length];
        int i = 0;
        for (String index : indexes) {
            result[i] = Integer.parseInt(index);
            i++;
        }

        return result;
    }

    @Override
    public double[] findNumbers(String text) throws CustomException {
        ArrayList<Double> resultList = new ArrayList<>();
        String[] textArray = text.split(" ");

        for (String word : textArray) {
            String wordTrue = isTrueDouble(word);
            if (!wordTrue.equals("-")) {
                Double number = Double.parseDouble(wordTrue);
                resultList.add(number);
            }
        }

        if (resultList.isEmpty()) {
            throw new CustomException("Not found");
        }

        double[] result = new double[resultList.size()];

        for (int i = 0; i < result.length; i++) {
            result[i] = resultList.get(i);
        }

        return result;
    }

    private String isTrueDouble(String word) {
        int pointCount = 0;
        StringBuilder wordBuilder = new StringBuilder(word);
        for (int i = 0; i < word.length(); i++) {
            if (i == 0 && (word.charAt(i) == '.' || word.charAt(i) == ',')) {
                return "-";
            }

            if (word.charAt(i) == '.' || word.charAt(i) == ',') {
                pointCount++;
                if (word.charAt(i) == ',') {
                    wordBuilder.setCharAt(i, '.');
                }
            } else if (!Character.isDigit(word.charAt(i)) && word.charAt(0) != '-') {
                return "-";
            }

            if (i == word.length() - 1) {
                if (word.charAt(word.length() - 1) == '.' || word.charAt(word.length() - 1) == ',') {
                    wordBuilder.deleteCharAt(word.length() - 1);
                    break;
                }
            }

            if (pointCount > 1) {
                return "-";
            }
        }

        if (pointCount == 0 || wordBuilder.indexOf(".") < 0) {
            return "-";
        }

        return wordBuilder.toString();
    }
}
