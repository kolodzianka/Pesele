public class Pesel {
    public static boolean sprawdz(String pesel) {
        // zakładamy tablicę z wagami
        int[] wagi = {1, 3, 7, 9, 1, 3, 7, 9, 1, 3};

        // sprawdzamy długość PESEL'a, jeśli nie jest to 11 zwracamy false
        if (pesel.length() != 11) return false;

        // zakładamy zmienną będącą sumą kontrolną
        int suma = 0;

        // liczymy w pętli sumę kontrolną przemnażając odpowiednie
        // cyfry z PESEL'a przez odpowiednie wagi
        for (int i = 0; i < 10; i++)
            suma += Integer.parseInt(pesel.substring(i, i + 1)) * wagi[i];

        // pobieramy do zmiennej cyfraKontrolna wartość ostatniej cyfry z PESEL'a
        int cyfraKontrolna = Integer.parseInt(pesel.substring(10, 11));

        // obliczamy cyfrę kontrolną z sumy (najpierw modulo 10 potem odejmujemy 10 i jeszcze raz modulo 10)
        suma %= 10;
        suma = 10 - suma;
        suma %= 10;

        // zwracamy wartość logiczną porównania obliczonej i pobranej cyfry kontrolnej
        return (suma == cyfraKontrolna);

    }
}
