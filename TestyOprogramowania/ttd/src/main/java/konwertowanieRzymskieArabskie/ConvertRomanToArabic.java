package konwertowanieRzymskieArabskie;

import java.util.ArrayList;
import java.util.List;

public class ConvertRomanToArabic {
    public int convertToArabic(String romanNumber) {
        if (romanNumber.equals("") || isRomanNumber(romanNumber) == false)
            return 0;

        char[] numberArray = romanNumber.toUpperCase().toCharArray();
        List<Integer> arabicValues = new ArrayList();


        for (int i = 0; i < numberArray.length; i++) {
            if (numberArray[i] == 'X')
                arabicValues.add(10);
            else if (numberArray[i] == 'L')
                arabicValues.add(50);
            else if (numberArray[i] == 'C')
                arabicValues.add(100);
            else if (numberArray[i] == 'D')
                arabicValues.add(500);
            else if (numberArray[i] == 'M')
                arabicValues.add(1000);
            else if (numberArray[i] == 'I') {
                if (i + 1 < numberArray.length) { // jest to conajmniej 1
                    if (numberArray[i + 1] == 'I') {// jest to conajmniej 2
                        if (i + 2 < numberArray.length) {
                            if (numberArray[i + 2] == 'I') {
                                arabicValues.add(3);
                                i += 2;
                            } else {
                                arabicValues.add(2);
                                i++;
                            }
                        } else {
                            arabicValues.add(2);
                            i++;
                        }
                    } else if (numberArray[i + 1] == 'V') {
                        arabicValues.add(4);
                        i++;
                    } else if (numberArray[i + 1] == 'X') {
                        arabicValues.add(9);
                        i++;
                    } else { // jest to 1
                        arabicValues.add(1);
                    }
                } else {
                    arabicValues.add(1);
                }
            } else if (numberArray[i] == 'V') {
                if (i + 1 < numberArray.length) { //
                    if (numberArray[i + 1] == 'I') {//
                        if (i + 2 < numberArray.length) {
                            if (numberArray[i + 2] == 'I') {
                                if (i + 3 < numberArray.length) {
                                    if (numberArray[i + 3] == 'I') {
                                        arabicValues.add(8);
                                        i += 3;
                                    } else {
                                        arabicValues.add(8);
                                        i += 2;
                                    }
                                } else {
                                    arabicValues.add(7);
                                    i += 2; //?????????????????????????+3
                                }
                            } else {
                                arabicValues.add(6);
                                i++;
                            }
                        } else {
                            arabicValues.add(6);
                            i++;
                        }
                    } else if (numberArray[i + 1] == 'X') {
                        arabicValues.add(9);
                        i++;
                    } else {
                        arabicValues.add(5);
                    }
                } else {
                    arabicValues.add(5);
                }
            }
        }
        return calculateToArabicFromAList(arabicValues);
    }

    public boolean isRomanNumber(String romanNumber) {
        char[] numberArray = romanNumber.toUpperCase().toCharArray();

        for (char x : numberArray) {
            if (x != 'I' && x != 'V' && x != 'X' && x != 'L' && x != 'C' && x != 'D' && x != 'M')
                return false;
        }
        return true;
    }

    public int calculateToArabicFromAList(List<Integer> list) {
        //  Integer[] temp = new Integer[list.size()];
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            if (i + 1 < list.size()) {
                if (list.get(i) < list.get(i + 1)) {// np 10 100 -> 90
                    sum = sum + list.get(i + 1) - list.get(i);
                    i++;
                } else sum = sum + list.get(i);
            } else sum = sum + list.get(i);
        }
        return sum;
    }


}
