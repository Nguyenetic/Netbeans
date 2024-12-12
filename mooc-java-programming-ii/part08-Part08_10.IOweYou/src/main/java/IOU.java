/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Copyright 2024 John Nguyen.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


/**
 *
 * @author John Nguyen at synergyn
 */
;
import java.util.HashMap;
// class
public class IOU {
    
    // HashMap to store debts with the person's name as the key
    private HashMap<String, Double> debts;

    // Constructor to initialize the IOU object
    public IOU() {
        this.debts = new HashMap<>();
    }

    // Sets the sum owed to a person
    public void setSum(String toWhom, double amount) {
        debts.put(toWhom, amount);
    }

    // Returns the amount owed to the specified person
    public double howMuchDoIOweTo(String toWhom) {
        return debts.getOrDefault(toWhom, 0.0);
    }
}


    

