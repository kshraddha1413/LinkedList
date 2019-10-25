import java.util.Iterator;

import java.util.LinkedList;
import java.util.ListIterator;
//Program to add items in linked list in alphabatical order
//linked list has a method iterator which has facility to go farword and backward both direction
public class LLDemo {

	public static void main(String[] args) {
     LinkedList<String> linkList=new LinkedList<String>();
		/*
		 * linkList.add("adetroit"); linkList.add("clansing"); linkList.add("flint");
		 * linkList.add("livonia"); linkList.add("farmington"); printPlaces(linkList);
		 * System.out.println("+++++++++++after adding++++++++++=");
		 * linkList.add(1,"wbloomfield");//adding place to index position 1
		 * printPlaces(linkList); linkList.remove(4);//removing place at position index
		 * 4 System.out.println("+++++++++++after removing++++++++++=");
		 * printPlaces(linkList); addNewCity(linkList,"btroy");//adding new city in
		 * alphabatical order printPlaces(linkList);
		 */
     
         addNewCity(linkList, "cincinati");
         addNewCity(linkList, "alaska");
         addNewCity(linkList, "NewJersy");
         addNewCity(linkList, "bostan");
         addNewCity(linkList, "denvar");
        
         printPlaces(linkList);
         addNewCity(linkList, "bostan");
         
     	}
	
	
	public static void printPlaces(LinkedList<String> linklist) {
		Iterator<String> i= linklist.iterator();//Iterator is method for itereating linked list elements
		while(i.hasNext()) {//hasNext() hold the reference of next element
			System.out.println("Places " +i.next());//next element is points to the next value in the linkedlist
		}
	}
	
	public static boolean addNewCity(LinkedList<String>ll, String newCity) {
		ListIterator<String> i =ll.listIterator();//ListIterearor is a special method for linkedList
		while(i.hasNext()) {
			int comaparision=0;
			comaparision=i.next().compareToIgnoreCase(newCity);
			if(comaparision==0) {
				System.out.println("allready in the list");
				return false;
			}else if(comaparision>0) {//i.next allready passed and it pointing to clansing
				//and we want to put btroy which will come before clancing
			   i.previous();//by this method i is again is pointing to adetroit
			   i.add(newCity);
			   return true;
			}else if(comaparision<0) {
				
			}
			
			
		}
		i.add(newCity);
		return true;
		
		
	}

}
