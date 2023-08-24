import java.util.*;
class collection extends ArrayList
{
	
	public static void main(String [] args)

	{

		ArrayList al = new ArrayList();

		// Arraylist allows duplicate data and here array size is dynamic that is it is nnot fixed									// 		 
		:wq
			// 		 		// 1st Add method
									// 		 				al.add(10);
									// 		 						al.add(30.5f);
									// 		 								al.add("Harshada");
									// 		 										al.add(30.5f);
									// 		 												al.add(10);
									//
									// 		 														System.out.println(al);
									//
									// 		 																// add(int, E) method
									// 		 																		 al.add(3,"Collection");
									// 		 																		 		 System.out.println(al);
									// 		 																		 		 		
									// 		 																		 		 			        // size()
									// 		 																		 		 			        	//	al.Size();
									// 		 																		 		 			        			 System.out.println(al.size());
									//
									// 		 																		 		 			        			 		 //contains(object)
									// 		 																		 		 			        			 		 		 System.out.println(al.contains("Harshada"));
									// 		 																		 		 			        			 		 		 		 System.out.println(al.contains(30));
									//
									// 		 																		 		 			        			 		 		 		 		 //IndexOf(object)
									// 		 																		 		 			        			 		 		 		 		 		 System.out.println(al.indexOf(10));
									// 		 																		 		 			        			 		 		 		 		 		 		 System.out.println(al.indexOf(30.5f));
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 //LastIndexof method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 System.out.println(al.lastIndexOf(30.5f));
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 // get method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  System.out.println(al.get(3));
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  //set(int, E)
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 System.out.println(al.set(3,"Incubator"));
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 System.out.println(al);
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 //addAll method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 		ArrayList al2 = new ArrayList();
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 				al2.add("Money");
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 						al2.add("Education");
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								al2.add("career");
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       	// addAll(collections)
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       			al.addAll(al2);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					System.out.println(al);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               		// removeRange(3,5)
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               		//	         al.removeRange(3,5);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               		//		 System.out.println(al);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 /*here is error becuase removeRange access specifier is protected
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 so we extend ArrayList */
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 // remove(int) method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  System.out.println(al.remove(3));
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		  System.out.println(al);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                   
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    // toArray() method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		 Object arr[] = al.toArray();
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  System.out.println(arr);
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 for(Object data : arr)
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 {
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 System.out.print(data + " ");
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 }
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 System.out.println();
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 // clear method
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 		 //  al.clear();
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 		 		 //  System.out.println(a);
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 		 		 		 //
									//
									//
									//
									//
									//
									//
									//
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 		 		 		 	}
									// 		 																		 		 			        			 		 		 		 		 		 		 		 		 		 		 		  		  		 		 		 								             	       					               				 		 		 		 		 		  		                                    		                  		 		 			 		 		 		 		 		 		 	}
