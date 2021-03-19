package ejercicio6;

public class StringUtil {
    // Retorna una cadena compuesta por n caracteres c
    // Ejemplo: replicate('x',5) ==> 'xxxxx'
    public static String replicate(char c, int n) {
        String s = "";
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }

    // Retorna una cadena de longitud n, compuesta por s
    // y precedida de tantos caracteres c como sea necesario
    // para completar la longitud mencionada
    // Ejemplo lpad("5",3,'0') ==> "005"
    public static String lpad(String s, int n, char c) {
        return replicate(c, n) + s;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static String[] toStringArray(int arr[]) {
        String[] sArr = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sArr[i] = String.valueOf(arr[i]);
        }
        return sArr;
    }

    // Retorna un String[] conteniendo los elementos de arr
    // representados como cadenas de caracteres
    public static int[] toIntArray(String arr[]) {
        int[] iArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }
        return iArr;
    }

    // Retorna la longitud del elemento con mayor cantidad
    // de caracteres del array arr
    public static int maxLength(String arr[]) {
        int maxDigits = 0;
        for (String s : arr) {
            if (maxDigits < s.length()) {
                maxDigits = s.length();
            }
        }
        return maxDigits;
    }

    // Completa los elemento del arr agregando caracteres c
    // a la izquierda, dejando a todos con la longitud del mayor
    public static void lNormalize(String arr[], char c) {
        int maxL = maxLength(arr);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = lpad(arr[i], maxL - arr[i].length(), c);
        }
    }


    /*
    Retorna una cadena de longitud n, compuesta por s
    y precedida de tantos caracteres c como sea necesario
    para completar la longitud mencionada
    Ejemplo lpad("5",3,'0') ==> "005"

    public static String lpad(String s, int n, char c) {
        return replicate(c, n) + s;
    }
     */


    // idem lpad, pero agregando caracteres a la derecha.
    public static String rpad(String s, char c, int n) {
        for (int i = 0; i < n; i++) {
            s += c;
        }
        return s;
    }

    // Retorna una cadena idéntica a s pero sin espacios a la izquierda.
    public static String ltrim(String s) {
        String[] characters = s.split("");
        for (int i = 0; i < characters.length; i++) {
            if (!characters[i].equals(" ")) return s.substring(i);
        }
        return s;
    }

    // idem ltrim, pero sin espacios a la derecha.
    // ToDo
    public static String rtrim(String s) {
        String[] characters = s.split("");
        for (int i = characters.length - 1; i >= 0; i--) {
            if (!characters[i].equals(" ")) return s.substring(0, i+1);
        }
        return s;
    }

    // idem lpad, pero sin espacios a derecha ni izquierda.
    public static String trim(String s) {
        return s.trim();
    }
    /*
    Retorna la posición de la n-ésima
    ocurrencia del carácter c dentro de s, o -1 si s no contiene a c. Por ejemplo, si s =
    “John|Paul|George|Ringo”, c = ‘|’ y n=2, la función debe retornar la posicióon de la
    segunda ocurrencia del carácter ‘|’ (pipe) dentro de la cadena s. Que, en este caso, es: 9.
    */

    public static int indexOfN(String s, char c, int n) {
        String[] character = s.split("");
        int a = 0;
        for (int i = 0; i < character.length; i++) {
            if (s.charAt(i) == c) {
                a++;
                if (a == n) return i;
            }
        }
        return -1;
    }
}
