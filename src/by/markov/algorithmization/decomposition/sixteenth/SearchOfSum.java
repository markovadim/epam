package by.markov.algorithmization.decomposition.sixteenth;
//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

public class SearchOfSum {

    public int getSizeArray(int number) {           //возвращает количество цифр числа135
        int size = 1;
        while (number > 10) {
            number /= 10;
            size++;
        }
        return size;
    }

    public boolean check(int number) {              //проверка на нечетность
        int[] arrayOfNumeral = getNumeral(number);

        boolean result = true;
        for (int numeral : arrayOfNumeral) {
            if (numeral % 2 != 0) {
                result = true;
            } else {
                result = false;
                break;
            }
        }
        if (result) {
            return true;
        } else {
            return false;
        }
    }

    public int[] getNumeral(int number) {           //занесение цифр числа в массив
        int[] arrayOfNumeral = new int[getSizeArray(number)];
        for (int i = arrayOfNumeral.length - 1; i >= 0; i--) {
            arrayOfNumeral[i] = number % 10;
            number /= 10;
        }
        return arrayOfNumeral;
    }

    public int getSumOfNumeral(int number) {            //подсчет суммы цифр
        int[] arrayOfNumeral = getNumeral(number);
        int sumOfNumeral = 0;
        for (int numeral : arrayOfNumeral) {
            sumOfNumeral += numeral;
        }
        return sumOfNumeral;
    }

    public void getResult(int number) {
        if (check(number)) {
            System.out.println(getSumOfNumeral(number));
        } else {
            System.out.println("В числе есть четное(-ые) число.");
        }
    }
}
