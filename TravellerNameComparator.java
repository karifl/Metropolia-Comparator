/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usingjcapicomparator;

import java.util.*;
/**
 *
 * @author vision
 */
public class TravellerNameComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
            TrafficCard tc = (TrafficCard) o1;
            TrafficCard traveller = (TrafficCard) o2;
        
        if (traveller.mOwnerName.charAt(0) == tc.mOwnerName.charAt(0)){  //valintakriteeriksi valittu matkustajanumero
            return 0;
        } else if(traveller.mOwnerName.charAt(0) > tc.mOwnerName.charAt(0)){
            return 1;
        } else{
            return -1;
        }}
    
}
