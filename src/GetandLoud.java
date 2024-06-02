public class GetandLoud {
    String monedaBase;
    String MonedaCambiada;
    Double cambioElegido;
    Double resultado;

    public GetandLoud(Divisas cambio) {
        this.monedaBase = cambio.base_code();
        this.MonedaCambiada = cambio.Target_Code();
        this.cambioElegido = cambio.Conversion_rate();
        this.resultado = cambio.conversion_result();
    }

    @Override
    public String toString() {
        return
                "moneda Base= " + "[" + monedaBase + "]" +
                        ", MonedaCambiada=" + "[" + MonedaCambiada + "]" +
                        ", cambioElegido=" + "[" + cambioElegido + "]" +
                        ", resultado=" + "[" + resultado + "]";

    }
}
