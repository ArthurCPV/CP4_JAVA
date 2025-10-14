package br.com.fiap.api.Playstation;

public class PlaystationReleaseDate {

    private String Japan;
    private String NorthAmerica;
    private String Europe;
    private String Australia;

    public PlaystationReleaseDate() {
    }

    public PlaystationReleaseDate(String japan, String northAmerica, String europe, String australia) {
        Japan = japan;
        NorthAmerica = northAmerica;
        Europe = europe;
        Australia = australia;
    }

    public String getJapan() {
        return Japan;
    }

    public void setJapan(String japan) {
        Japan = japan;
    }

    public String getNorthAmerica() {
        return NorthAmerica;
    }

    public void setNorthAmerica(String northAmerica) {
        NorthAmerica = northAmerica;
    }

    public String getEurope() {
        return Europe;
    }

    public void setEurope(String europe) {
        Europe = europe;
    }

    public String getAustralia() {
        return Australia;
    }

    public void setAustralia(String australia) {
        Australia = australia;
    }

    @Override
        public String toString() {
            return "\nDatas de Lançamento:" +
                    "\nJapão: " + Japan +
                    "\nAmérica do Norte: " + NorthAmerica +
                    "\nEuropa: " + Europe +
                    "\nAustrália: " + Australia;
        }
    }

