package votantes;


import javax.swing.JOptionPane;

public class Votantes {

    public static void main(String[] args) {

        int n = 100 + (int)(Math.random()*500); 
        System.out.println(n);
        char votantes[][] = new char[2][n];
        int aprobacionhombres = 0, desaprobacionmujeres = 0, totalaprobacion = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < n; j++) {
                votantes[i][j] = (char) (100+Math.random()*500 + 'a');
                if (String.valueOf(votantes[0][j]).equals("a")) {
                    aprobacionhombres++;
                }
                if (String.valueOf(votantes[1][j]).equals("b")) {
                    desaprobacionmujeres++;
                }
                if (String.valueOf(votantes[i][j]).equals("a")) {
                    totalaprobacion++;
                }
            }
        }
        int pocentajeaprobacion = (totalaprobacion * 100 / (n * 2));
        JOptionPane.showMessageDialog(null, "El total de hombres que aprrueban la gestion es de:  " + aprobacionhombres
                + "\n" + "El total de mujeres que desaprueban la gestion es de:  " + desaprobacionmujeres
                + "\n" + "El Porcentaje de aprobacion de la gestion es de:  " + pocentajeaprobacion + "%"
                + "\n" + "El total de votantes es de:  " + n);
    }

}
