package com.mycompany.tp6_part2;

public abstract class Materials {

    public int id;

    public String regestration_number;

    public String date_installation;

    public Materials(int id, String re, String di) {
        this.id = id;
        this.regestration_number =re;
        this.date_installation = di;
    }
}
