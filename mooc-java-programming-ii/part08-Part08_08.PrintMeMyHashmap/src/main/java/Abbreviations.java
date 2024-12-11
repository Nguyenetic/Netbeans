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
import java.util.HashMap;

/**
 * This class manages abbreviations and their explanations using a HashMap.
 */
class Abbreviations {
    private HashMap<String, String> abbreviations;

    /**
     * Constructor initializes the HashMap to store abbreviations and explanations.
     */
    public Abbreviations() {
        this.abbreviations = new HashMap<>();
    }

    /**
     * Adds a new abbreviation and its explanation to the collection.
     * @param abbreviation The abbreviation to be added.
     * @param explanation The explanation associated with the abbreviation.
     */
    public void addAbbreviation(String abbreviation, String explanation) {
        this.abbreviations.put(abbreviation.toLowerCase(), explanation);
    }

    /**
     * Checks if the abbreviation exists in the collection.
     * @param abbreviation The abbreviation to check for.
     * @return True if the abbreviation exists, otherwise false.
     */
    public boolean hasAbbreviation(String abbreviation) {
        return this.abbreviations.containsKey(abbreviation.toLowerCase());
    }

    /**
     * Finds the explanation associated with the given abbreviation.
     * @param abbreviation The abbreviation whose explanation is to be retrieved.
     * @return The explanation if the abbreviation exists, otherwise null.
     */
    public String findExplanationFor(String abbreviation) {
        return this.abbreviations.get(abbreviation.toLowerCase());
    }
}
