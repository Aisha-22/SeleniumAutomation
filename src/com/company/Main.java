package com.company;

import com.company.ParentChild;
import com.company.DynamicDropdown;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        //Objects are used in java to call 'variables and methods' of they own 'classes'.

        /*Syntax:
        ClassName Object = new ClassName();
        */

        Dropdown dropdown = new Dropdown();

        dropdown.runSelect();

        UpdatedDropdown updateddropdown = new UpdatedDropdown();

//        updateddropdown.getDropDown();

        DynamicDropdown dynamicdropdown = new DynamicDropdown();

//        dynamicdropdown.runDymanicDropdown();



        ParentChild parentchild = new ParentChild();

//        parentchild.runParentChild();

    }
}
