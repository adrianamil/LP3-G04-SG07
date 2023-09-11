package fexa;

/**
 *
 * @author JORGE TICONA
 */
import java.time.LocalDate;
import java.util.Scanner;

public class Fexa {
    private int dia;
    private int mes;
    private int año;
   
    
    // Constructor predeterminado con el 1-1-1900 como fecha por defecto
    public Fexa() {
        this(1, 1, 1900);
    }

    // Constructor parametrizado con día, mes y año
    public Fexa(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        valida();
    }

    // Método para leer la fecha desde el usuario
    public void leer() {
        Scanner scanner = new Scanner(System.in);

        // Solicitar y leer el día (1 a 31)
            System.out.println("Introduce el dia (1 a 31): ");
            this.dia = scanner.nextInt();
        // Solicitar y leer el mes (1 a 12)
            System.out.println("Introduce el mes (1 a 12): ");
            this.mes = scanner.nextInt();
        // Solicitar y leer el año (1900 a 2050)
            System.out.println("Introduce el anio (1900 a 2050): ");
            this.año = scanner.nextInt();

        valida();
    }

    // Método para verificar si el año es bisiesto
    public boolean bisiesto() {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
    //Método para ver el numero de dias de un mes
    public int diasMes(int mes) {
    int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    if (mes >= 1 && mes <= 12) {
        return diasPorMes[mes - 1];
    } else {
        return -1; // Mes inválido
    }
}

    // Método auxiliar para validar la fecha
    private void valida() {
        if (dia < 1 || dia > 31) {
            dia = 1;
        }
        if (mes < 1 || mes > 12){
            mes = 1;
        }
        if (año < 1900 || año > 2050){
            año = 1900;
        }
    }
        // Accesor para obtener el día
    public int getDia() {
        return dia;
    }
    // Mutador para establecer el día
    public void setDia(int dia) {
        this.dia = dia;
        valida();
    }
    // Accesor para obtener el mes
    public int getMes() {
        return mes;
    }
    // Mutador para establecer el mes
    public void setMes(int mes) {
        this.mes = mes;
        valida();
    }
  // Accesor para obtener el año
    public int getAño() {
        return año;
    }
    // Mutador para establecer el año
    public void setAño(int año) {
        this.año = año;
        valida();
    }
    
   public int diasTranscurridos() {
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int dias = dia - 1; // Restamos 1 para no contar el día actual

        // Sumamos los días de los meses anteriores en el año actual
        for (int i = 0; i < mes - 1; i++) {
            dias += diasPorMes[i];
        }

        // Sumamos los días de los años completos desde 1900 hasta el año actual
        for (int i = 1900; i < año; i++) {
            if (bisiesto()) {
                dias += 366;
            } else {
                dias += 365;
            }
        }

        return dias;
    }
   public int diaSemana() {
    int q = dia;
    int m = mes;
    int K = año % 100;
    int J = año / 100;

    // Zeller's Congruence formula
    int h = (q + (13 * (m + 1)) / 5 + K + (K / 4) + (J / 4) - 2 * J) % 7;

    if (h < 0) {
        h += 7;
    }
    
    h = (h + 6) % 7;

    return h;
}
   //Metodo para el dia siguiente
   public String siguiente() {
      LocalDate fecha =LocalDate.of(año, mes, dia);
      fecha = fecha.plusDays(1);
      this.dia = fecha.getDayOfMonth();
      this.mes = fecha.getMonthValue();
      this.año = fecha.getYear();
      return String.format("%02d-%02d-%04d", dia, mes, año);
   }
   //Metodo para el dia anterior
   public String anterior() {
       LocalDate fecha = LocalDate.of(año, mes, dia);
       fecha = fecha.minusDays(1);
       this.dia = fecha.getDayOfMonth();
       this.mes = fecha.getMonthValue();
       this.año = fecha.getYear();
       return String.format("%02d-%02d-%04d", dia, mes, año);
   }
   //FECHA FUTURA
   public void fechaFutura(long dias) {
   // Fecha de inicio x-xx-xxxx
        int diaInicio = dia;
        int mesInicio = mes;
        int añoInicio = año;
        // Número de días en cada mes (suponemos que el año de inicio no es bisiesto)
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        // Incrementamos la fecha 
        dia = diaInicio;
        mes = mesInicio;
        año = añoInicio;

        while (dias > 0) {
            int diasEnMes = diasPorMes[mes - 1];

            // Si el año es bisiesto y estamos en febrero, ajustamos los días en el mes
            if (mes == 2 && bisiesto()) {
                diasEnMes = 29;
            }
            // Restamos los días en el mes actual o avanzamos al siguiente mes
            if (dias >= diasEnMes - dia + 1) {
                dias -= diasEnMes - dia + 1;
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    año++;
                }
            } else {
                dia += (int) dias;
                dias = 0;
            }
        }
    }   
   //ingresaer x numero y mostrarlo en dias
   public void fechaTras(long dias) {
        // Fecha de inicio (1-1-1900)
        int diaInicio = 1;
        int mesInicio = 1;
        int añoInicio = 1900;

        // Número de días en cada mes (suponemos que el año de inicio no es bisiesto)
        int[] diasPorMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        // Incrementamos la fecha en función de los días
        dia = diaInicio;
        mes = mesInicio;
        año = añoInicio;

        while (dias > 0) {
            int diasEnMes = diasPorMes[mes - 1];

            // Si el año es bisiesto y estamos en febrero, ajustamos los días en el mes
            if (mes == 2 && bisiesto()) {
                diasEnMes = 29;
            }

            // Restamos los días en el mes actual o avanzamos al siguiente mes
            if (dias >= diasEnMes - dia + 1) {
                dias -= diasEnMes - dia + 1;
                dia = 1;
                mes++;
                if (mes > 12) {
                    mes = 1;
                    año++;
                }
            } else {
                dia += (int) dias;
                dias = 0;
            }
        }
    }   
   public Fexa copia(){
       return new Fexa(this.dia, this.mes, this.año);
   }
   public static boolean igualQue(Fexa fecha3, Fexa fecha4) {
    return fecha3.getDia() == fecha4.getDia() &&
           fecha3.getMes() == fecha4.getMes() &&
           fecha3.getAño() == fecha4.getAño();
}
   public boolean menorQue(Fexa otraFecha) {
    if (this.getAño() < otraFecha.getAño()) {
        return true;
    } else if (this.getAño() == otraFecha.getAño()) {
        if (this.getMes() < otraFecha.getMes()) {
            return true;
        } else if (this.getMes() == otraFecha.getMes()) {
            return this.getDia() < otraFecha.getDia();
        }
    }
    return false;
}
   public boolean mayorQue(Fexa otraFecha) {
    if (this.getAño() > otraFecha.getAño()) {
        return true;
    } else if (this.getAño() == otraFecha.getAño()) {
        if (this.getMes() > otraFecha.getMes()) {
            return true;
        } else if (this.getMes() == otraFecha.getMes()) {
            return this.getDia() > otraFecha.getDia();
        }
    }
    return false;
}

    // Ejemplo de un método para mostrar la fecha en formato corto
   public String corta() {
        return String.format("%02d-%02d-%04d", dia, mes, año);
    }
    // Ejemplo de un método para mostrar la fecha en formato corto
   public String larga() {
    String[] diasSemana = {"Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado", "Domingo"};
    String[] nombresMeses = {
        "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio",
        "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"
    };

    int diaSem = diaSemana();
    String diaSemanaStr = diasSemana[diaSem];
    String nombreMes = nombresMeses[mes - 1];

    return diaSemanaStr + " " + dia + " de " + nombreMes + " de " + año;
}
//MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN MAIN
    // Método principal
    public static void main(String[] args) {
        Fexa fecha1 = new Fexa();
        System.out.println("Fecha por defecto: " + fecha1.corta());

        Fexa fecha2 = new Fexa(2, 9, 2023);
        System.out.println("Fecha 2: " + fecha2.corta());
        
         Scanner scanner = new Scanner(System.in);
         Fexa fecha = new Fexa();
         // Solicita al usuario ingresar la cantidad de días
         System.out.print("Ingresa la cantidad de dias que quiere agregar: ");
         long dias = scanner.nextLong();
         // Llama al método fechaTras para actualizar la fecha
         fecha.fechaTras(dias);
         // Muestra la nueva fecha
         System.out.println("Nueva fecha despues de " + dias + " dias: " + fecha.corta());

        // Utilizar el método leer() para ingresar una nueva fecha desde el usuario
        Fexa fecha3 = new Fexa();
        fecha3.leer();
        System.out.println("Fecha ingresada: ");
        System.out.println(fecha3.corta());
        System.out.println(fecha3.larga());
         int numeroDias = fecha3.diasMes(fecha3.getMes());
         if (numeroDias != -1) {
             System.out.println("El mes tiene " + numeroDias + " dias.");
         } else {
             System.out.println("Mes invalido.");
         }
        int diaSemana = fecha3.diaSemana();
        String[] diasSemana = {"Domingo", "Lunes", "Martes", "Miercoles", "Jueves", "Viernes", "Sábado"};
        System.out.println("Dia de la semana: " + diasSemana[diaSemana]);
        
        String fechaAnterior = fecha3.anterior();
        System.out.println("Dia anterior: "+fechaAnterior);
        
        String fechaSiguiente = fecha3.siguiente();
        System.out.println("Dia siguiente: " + fechaSiguiente);
        
        if (fecha3.bisiesto()) {
            System.out.println("El anio ingresado es bisiesto.");
        } else {
            System.out.println("El anio ingresado no es bisiesto.");
        }
        
        int diasTranscurridos = fecha3.diasTranscurridos();
        System.out.println("Dias transcurridos desde el 1-1-1900: " + diasTranscurridos);
      
        System.out.print("Ingresa la cantidad de dias que quiere agregar: ");
        long diass =scanner.nextLong();
         // Llama al método fechaTras para actualizar la fecha
        fecha3.fechaFutura(diass);
         // Muestra la nueva fecha
        System.out.println("Nueva fecha despues de " + diass + " dias: " + fecha3.corta());
        Fexa fecha4 = fecha3.copia(); // Crea una copia de fecha3
        System.out.println("Copia de la fecha ingresada: " + fecha3.corta());
        fecha4.fechaFutura(diass);
        if (Fexa.igualQue(fecha3, fecha4)) {
            System.out.println("Las fechas son iguales.");
        } else {
            System.out.println("Las fechas son diferentes.");
        }
        if (fecha3.menorQue(fecha4)) {
            System.out.println("fecha3 es menor que fecha4.");
        } else if (Fexa.igualQue(fecha3, fecha4)) {
            System.out.println("fecha3 es igual a fecha4.");
        } else {
            System.out.println("fecha4 es menor que fecha3.");
        }
        if (fecha3.menorQue(fecha4)) {
        System.out.println("fecha4 es mayor que fecha3.");
        } else if (Fexa.igualQue(fecha3, fecha4)) {
        System.out.println("fecha3 es igual a fecha4.");
        } else if (fecha3.mayorQue(fecha4)) {
        System.out.println("fecha3 es mayor que fecha4.");
        }
    }
    
}
