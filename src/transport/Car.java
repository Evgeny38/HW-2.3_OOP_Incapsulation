package transport;

import java.time.LocalDate;

public class Car {
    private String brand;
    private String model;
    private double volumeDrive;
    private String color;
    private int yearMade;
    private String madeCountry;
    private String transmission;
    private String bodyType;
    private String registrationNumber;
    private int numberOfSeats;
    private String seasonTyres;
    private Key key;
    private Insurance insurance;

    public Car(String brand, String model, double volumeDrive, String color, int yearMade, String madeCountry,
               String transmission, String bodyType, String registrationNumber, int numberOfSeats,
               String seasonTyres) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }else{
            this.brand =" Информация не указана.";
        }
        if (model != null && !model.isEmpty() && !model.isBlank()) {
            this.model = model ;
        }else{
            this.model =" Информация не указана." ;
        }
        if ( volumeDrive <= 0) {
            this.volumeDrive = 1.5;
        }else {
            this.volumeDrive = volumeDrive;
        }
        if (color != null && !color.isEmpty() && !color.isBlank()) {
            this.color = color;
        }else{
            this.color = " Информация не указана.";
        }
        if ( yearMade <= 0) {
            this.yearMade = 2000;
        }else {
            this.yearMade = yearMade;
        }
        if (madeCountry != null && !madeCountry.isEmpty() && !madeCountry.isBlank()) {
            this.madeCountry = madeCountry;
        }else{
            this.madeCountry = "Информация не указана.";
        }
        if (transmission!= null && !transmission.isEmpty() && !transmission.isBlank()) {
            this.transmission = transmission;
        }else{
            this.transmission = "Информация не указана.";
        }
        if (bodyType != null && !bodyType.isEmpty() && !bodyType.isBlank()) {
            this.bodyType = bodyType;
        }else{
            this.bodyType = "Информация не указана.";
        }
        if (registrationNumber != null && !registrationNumber.isEmpty() && !registrationNumber.isBlank()) {
            this.registrationNumber = registrationNumber;
        }else{
            this.registrationNumber = "Информация не указана.";
        }
        if ( numberOfSeats <= 0) {
            this.numberOfSeats = 5;
        }else {
            this.numberOfSeats = numberOfSeats;
        }
        this.seasonTyres = "summer tyres";


    }

    public double getVolumeDrive() {
        return volumeDrive;
    }

    public void setVolumeDrive(double volumeDrive) {
        this.volumeDrive = volumeDrive;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String isSeasonTyres() {
        return seasonTyres;
    }

    public void setSeasonTyres(String seasonTyres) {
        this.seasonTyres = seasonTyres;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearMade() {
        return yearMade;
    }

    public String getMadeCountry() {
        return madeCountry;
    }

    public int getNumberOfSeats() {

        return numberOfSeats;
    }

    public class Key {
        private boolean remoteLaunch ;
        private boolean keylessAccess ;
        public Key(boolean remoteLaunch, boolean keylessAccess) {
            this.remoteLaunch = remoteLaunch;
            this.keylessAccess = keylessAccess;
        }
        public boolean isRemoteLaunch() {
            return remoteLaunch;
        }
        public boolean isKeylessAccess() {
            return keylessAccess;
        }

        @Override
        public String toString() {
            return "Key{" +
                    "remoteLaunch=" + remoteLaunch +
                    ", keylessAccess=" + keylessAccess +
                    '}';
        }
    }

    public  class Insurance {
        private  LocalDate validUntil;
        private  double cost ;
        private  String insuranceNumber ;

        public Insurance(int validUntil, double cost, String insuranceNumber) {
            this.validUntil = LocalDate.ofEpochDay(validUntil);
            this.cost = cost;
            this.insuranceNumber = insuranceNumber;
        }
        public LocalDate getValidUntil() {
            return validUntil;
        }
        public double getCost() {
            return cost;
        }
        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        @Override
        public String toString() {
            return "Insurance{" +
                    "validUntil=" + validUntil +
                    ", cost=" + cost +
                    ", insuranceNumber='" + insuranceNumber + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", volumeDrive=" + volumeDrive +
                ", color='" + color + '\'' +
                ", yearMade=" + yearMade +
                ", madeCountry='" + madeCountry + '\'' +
                ", transmission='" + transmission + '\'' +
                ", bodyType='" + bodyType + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", numberOfSeats=" + numberOfSeats +
                ", seasonTyres='" + seasonTyres + '\'' +
                ", key=" + key +
                ", insurance=" + insurance +
                '}';
    }

    public void changeTyres() {
        this.seasonTyres = "winter tyres";
    }

    public boolean checkNumber() {
        if (registrationNumber.matches("[A-Z]\\d{3}[A-Z]{2}\\d{3}")) {
            this.registrationNumber = registrationNumber;
        }else {
            this.registrationNumber = "Неверный формат номера";
        }
        if (this.registrationNumber.length() < 9) {
            System.out.println("Это неправильный регистрационный номер");
            return false;
        }
        char[] number = this.registrationNumber.toCharArray();
        if (!Character.isAlphabetic(number[0])) {
            System.out.println("Это неправильный регистрационный номер");
            return false;
        }
        if (!Character.isDigit(number[1])) {
            System.out.println("Это неправильный регистрационный номер");
            return false;

        }
        return true;


    }

}
