package org.example;

public class CuentaBancaria{
    private double saldo;

    public CuentaBancaria ()  {
        this.saldo = 500;
    }

    public double ingregardinero(double ingresar) throws DepositoMaximoException{
        if (ingresar>3000){
                throw new DepositoMaximoException();
        }else {
           double saldo_actual = saldo+ingresar;
           setSaldo(saldo_actual);
        }
        return getSaldo();
    }

    public void retirardinero(double retirar) throws LimiteDiarioException, SaldoInsuficienteException {
        if (retirar>600) {
            throw new LimiteDiarioException();
        }else if (retirar>getSaldo()){
            throw new SaldoInsuficienteException();

        } else {
            double retirar_ = getSaldo()-retirar;
            setSaldo(retirar_);
        }

    }


    public void mostrarsaldo () {
        System.out.println("el saldo disponible es: "+getSaldo());
    }

    public void setSaldo(double saldo) {

        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }



    @Override
    public String toString() {
        return "CuentaBancaria{" +
                "saldo=" + saldo +
                '}';
    }
}
