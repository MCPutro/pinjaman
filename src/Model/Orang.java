/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author charlyhsitumorang
 */
public class Orang {
    private String id;
    private String name;
    private char jenis_kelamin;

    public Orang(String id, String name, char jenis_kelamin){
        this.id = id;
        this.name = name;
        this.jenis_kelamin = jenis_kelamin;
    }
    
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
