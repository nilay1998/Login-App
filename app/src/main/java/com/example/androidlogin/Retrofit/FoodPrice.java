package com.example.androidlogin.Retrofit;

public class FoodPrice
{
    private String food;
    private int price;

    public FoodPrice(String food, int price)
    {
        this.food=food;
        this.price=price;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
