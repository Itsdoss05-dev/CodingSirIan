/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sirianindividualcoding;

/**
 *
 * @author Uzuki
 */
public class Car {

    private String company_name;
    private String model_name;
    private Integer year;
    private Double mileage;

    public Car(String company_name, String model_name, Integer year, Double mileage) {
        this.company_name = company_name;
        this.model_name = model_name;
        this.year = year;
        this.mileage = mileage;
    }

    public String getCompanyName() {
        return company_name;
    }

    public void setCompanyName(String company_name) {
        this.company_name = company_name;
    }

    public String getModelName() {
        return model_name;
    }

    public void setModelName(String model_name) {
        this.model_name = model_name;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Double getMileage() {
        return mileage;
    }
}

    public boolean isClassic() {
        return getCarAge() > 30;
}
   public String getFullDescription() {
        return company_name + " " + model_name + " (" + year + "), Mileage: " + mileage +
               ", Age: " + getCarAge() + " years, Mileage Category: " + getMileageCategory() +
               (isClassic() ? " [Classic Car]" : "");
    }

   public String getMileageCategory() {
    if (mileage < 10000) return "Low";
    else if (mileage <= 50000) return "Medium";
    else return "High";
   }

   public Integer getCarAge() {
       return Year.now().getValue() - year; 
   }
