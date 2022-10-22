package modelo;

public class PlanTelefonia
{
    private String operador;
    private int cantMin;
    private double precioMin;
    private double precioPlan;


    public PlanTelefonia(String pOperador, int pCantMin, double pPrecioMin)
    {
        operador = pOperador;
        cantMin = pCantMin;
        precioMin = pPrecioMin;
    }

    public void calcularPlan()
    {
        double precio = 0;
        if (operador.equals("movilujo"))
        {
            precio = (cantMin * precioMin)*0.5;
        }
        else
        {
            precio = cantMin*precioMin;
        }
        precioPlan = precio;
    }
    public double getPlan()
    {
        return precioPlan;
    }
}