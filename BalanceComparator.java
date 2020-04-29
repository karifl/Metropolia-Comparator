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
public class BalanceComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
            TrafficCard tc = (TrafficCard) o1;
            TrafficCard traveller = (TrafficCard) o2;
        
        if (traveller.mBalance == tc.mBalance){  //valintakriteeriksi valittu matkustajanumero
            return 0;
        } else if(traveller.mBalance > tc.mBalance){
            return 1;
        } else{
            return -1;
        }}
    
}
