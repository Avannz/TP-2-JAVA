public class Cuenta {
    private float saldo;

    public Cuenta(float saldo) {
        this.saldo = saldo;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    public float ingresarSaldo(float dinero)
    {
        return saldo += dinero;
    }
    public float extrarSaldo(float dinero)
    {
        if(saldo<=dinero)
            {
                System.out.printf("NO HAY PLATA, ATTE: MILEI");
            }
        else
            {
             saldo -= dinero;
            }

        return saldo;
    }

    public float mostrar (){

        return saldo;
    }
}