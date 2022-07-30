package BinarySearch;

public class increment {
    public static void main(String[] args) {
        System.out.println(increment("00005"));
        System.out.println(increment("99999"));
        System.out.println(increment("PO-832"));
        System.out.println(increment("PO=999"));
        System.out.println(increment("RES202ADNVI0IPA"));
        System.out.println(increment("RES202ADNVI0IPA"));

    }


        static String padLeftZeros(String inputString, int length) {
            if (inputString.length() >= length) {
                return inputString;
            }
            StringBuilder sb = new StringBuilder();
            while (sb.length() < length - inputString.length()) {
                sb.append('0');
            }
            sb.append(inputString);

            return sb.toString();
        }

        static String increment(String referenceNumber) {

            // Finding the last digit index in referenceNumber
            int indexLastDigit = -1;
            for (int i = 0; i < referenceNumber.length(); i++){
                try {
                    Integer.parseInt(String.valueOf(referenceNumber.charAt(i)));
                    indexLastDigit = i;
                } catch (NumberFormatException nfe) {
                }
            }

            // Finding the first digit index of the last digit group in referenceNumber
            int indexFirstDigit = -1;
            for (int i = indexLastDigit; i >= 0; i--){
                try {
                    Integer.parseInt(String.valueOf(referenceNumber.charAt(i)));
                    indexFirstDigit = i;
                } catch (NumberFormatException nfe) {
                    break;
                }
            }

            // Checking if numberToIncrement needs reset or not
            String numberToIncrement = referenceNumber.substring(indexFirstDigit, indexLastDigit + 1);
            boolean isReset = true;
            for (int i = 0; i < numberToIncrement.length(); i++){
                if (numberToIncrement.charAt(i) != '9') {
                    isReset = false;
                }
            }

            // Incrementing or resetting number
            StringBuilder incrementedNumberSB = new StringBuilder();
            int incrementedNumberInt;
            if (isReset) {
                for (int i = 0; i < numberToIncrement.length(); i++){
                    incrementedNumberSB.append("0");
                }
            } else {
                incrementedNumberInt = Integer.parseInt(numberToIncrement) + 1;
                incrementedNumberSB.append(incrementedNumberInt);
            }

            // Creating result string according to referenceNumber structure
            String incrementedNumberString = padLeftZeros(incrementedNumberSB.toString(), numberToIncrement.length());
            String prefix = referenceNumber.substring(0, indexFirstDigit);
            String suffix = referenceNumber.substring(indexLastDigit + 1, referenceNumber.length());
            String result = "";

            if (prefix.length() > 0) {
                result += prefix;
            }
            result += incrementedNumberString;
            if (suffix.length() > 0) {
                result += suffix;
            }

            return result;

        }


}
