/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agencedelocationdevoiture;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;

/**
 *
 * @author wiemhjiri
 */
public class Agence {
 
    private String nom;
    private ListVoitures parking;    
    private Map<Client, ListVoitures> clientVoitureLoue; 

    public Agence(String nom, ListVoitures parking, Map<Client, ListVoitures> clientVoitureLoue) {
        this.nom = nom;
        parking =new ListVoitures();
        clientVoitureLoue = new HashMap<>();
    }


public void ajoutVoiture(Voiture v) throws VoitureException{
// à completer
parking.ajoutVoiture(v);

}
public void suppVoiture(Voiture v)throws VoitureException{
//à completer
parking.supprimeVoiture(v);
}

public void loueClientVoiture(Client cl, Voiture v)throws VoitureException{


//if(!clientVoitureLoue.containsKey(cl)){
//    clientVoitureLoue.put(cl, new ListVoitures());
//    clientVoitureLoue.get(cl).ajoutVoiture(v);
//    
//}
//else clientVoitureLoue.get(cl).ajoutVoiture(v);
//    suppVoiture(v);
//}


  //methode 2:
  
  
clientVoitureLoue.putIfAbsent(cl, new ListVoitures());
clientVoitureLoue.get(cl).ajoutVoiture(v);
    suppVoiture(v);
}


public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
// à completer
clientVoitureLoue.get(cl).supprimeVoiture(v);
     ajoutVoiture(v);
}
public List<Voiture> selectVoitureSelonCritere(Critere c){
//à completer
List<Voiture>list=new ArrayList<>();
for(Voiture v:parking.getVoitures())
    if(c.estSatisfaitPar(v))
        list.add(v);
return list;
}

public Set<Client> ensembleClientsLoueurs(){

return clientVoitureLoue.keySet();// à completer
}

public Collection<ListVoitures> collectionVoituresLouees(){
// à completer
return clientVoitureLoue.values();

}

public void afficheLesClientsEtLeursListesVoitures(){ 

//methode 1
        
//for(Map.Entry<Client,ListVoitures> en:clientVoitureLoue.entrySet())
//        System.out.println(en.getKey()+" "+en.getValue());
//methode 2:
        
clientVoitureLoue.forEach((K,v)->System.out.println(K+""+v));

                }
public Map<Client, ListVoitures> triCodeCroissant(){
//methode 1:
Map<Client,ListVoitures> tree=new TreeMap<>((a,b)->a.getCode()-b.getCode());
tree.putAll(clientVoitureLoue);
return tree;



}

public Map<Client, ListVoitures> triNomCroissant(){
    Map<Client,ListVoitures> tree=new TreeMap<>((a,b)->a.getNom().compareTo(b.getNom()));
tree.putAll(clientVoitureLoue);
return tree;
}
    
}
