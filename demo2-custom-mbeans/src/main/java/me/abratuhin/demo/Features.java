package me.abratuhin.demo;

public class Features implements FeaturesMBean {

    private String name;

    private Integer counter = Integer.valueOf(0);

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Integer getCounter() {
        return this.counter;
    }

    @Override
    public void setCounter(Integer counter) {
        this.counter = counter;
    }
}
