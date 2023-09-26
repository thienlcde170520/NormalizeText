/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import controller.NormalizeText;
import model.Text;

public class Main {

    public static void main(String[] args) {
        Text model = new Text();
        
        new NormalizeText(model).run();
    }
    
}
