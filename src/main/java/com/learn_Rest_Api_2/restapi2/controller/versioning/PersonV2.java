package com.learn_Rest_Api_2.restapi2.controller.versioning;

public class PersonV2 {
    private Team team;

    public PersonV2(Team team) {
        this.team = team;
    }

    public Team getName() {
        return team;
    }

    @Override
    public String toString() {
        return "PersonV2{" +
                "name=" + team +
                '}';
    }
}
