package creational.singleton.builder;

public class LunchOrderBuilder {

    public static class Builder{
        private String bread;
        private String tomato;
        private String eggs;
        private String cheese;
        private String dressing;
        private String avocado;
        private String meat;

        public Builder(){}

        public Builder withBread(String bread){
            this.bread = bread;
            return this;
        }

        public Builder withTomato(String tomato){
            this.tomato = tomato;
            return this;
        }

        public Builder withCheese(String  cheese){
            this.cheese = cheese;
            return  this;
        }

        public  Builder withEggs(String eggs){
            this.eggs = eggs;
            return this;
        }

        public Builder withDressing(String dressing){
            this.dressing = dressing;
            return this;
        }

        public Builder withAvocado(String avocado){
            this.avocado = avocado;
            return this;
        }

        public Builder withMeat(String meat){
            this.meat = meat;
            return this;
        }

        public LunchOrderBuilder build(){
            return new LunchOrderBuilder(this);
        }

    }


    private String bread;
    private String tomato;
    private String eggs;
    private String cheese;
    private String dressing;
    private String avocado;
    private String meat;

    public LunchOrderBuilder(Builder builder){
        this.tomato = builder.tomato;
        this.avocado = builder.avocado;
        this.bread = builder.bread;
        this.cheese = builder.cheese;
        this.dressing = builder.dressing;
        this.eggs = builder.eggs;
        this.meat = builder.meat;
    }

    public String getBread() {
        return bread;
    }

    public String getTomato() {
        return tomato;
    }

    public String getEggs() {
        return eggs;
    }

    public String getCheese() {
        return cheese;
    }

    public String getDressing() {
        return dressing;
    }

    public String getAvocado() {
        return avocado;
    }

    public String getMeat() {
        return meat;
    }
}
