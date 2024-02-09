package oop;

import oop.BaseCreditManager;
import oop.ICreditManager;

public class TeacherCreditManager extends BaseCreditManager implements ICreditManager {
    @Override
    public void calculate() {
        System.out.println("Öğretmen kredisi hesaplandi.");
    }
}