import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Company zotato = new Company("zotato");

        Restaurant shah = new authentic_restro("Shah", "okhla");
        Restaurant The_Chinese = new authentic_restro("The Chinese","kalkaji");
        Restaurant ravi = new Regular_restro("Ravi's","Govindpuri");
        Restaurant paradise =  new Regular_restro("Paradise", "harkesh nagar");
        Restaurant wang = new fastfood_restro("Wang's ", "okhla NSIC");

        zotato.addRestro_arr(shah);
        zotato.addRestro_arr(The_Chinese);
        zotato.addRestro_arr(ravi);
        zotato.addRestro_arr(paradise);
        zotato.addRestro_arr(wang);

        Customer Ram = new elite_cstmr("Ram","delhi");
        Customer Sam = new elite_cstmr("sam","delhi");
        Customer tim = new special_cstmr("tim", "delhi");
        Customer kim = new reg_cstmr("kim", "delhi");
        Customer Jim = new reg_cstmr("Jim", "delhi");

        zotato.addCustomer_arr(Ram);
        zotato.addCustomer_arr(Sam);
        zotato.addCustomer_arr(tim);
        zotato.addCustomer_arr(kim);
        zotato.addCustomer_arr(Jim);
        //for(int i= 0; i<zotato.getRestro_arr().size();i++)
        //{
        //System.out.println(i +")" + zotato.getRestro_arr().get(i).getName());
        //}

        boolean temp;
        temp = true;
        while (temp)
        {
            System.out.println("Welcome to Zotato:\n" +
                    "1) Enter as Restaurant Owner\n" +
                    "2) Enter as Customer\n" +
                    "3) Check User Details\n" +
                    "4) Company Account details\n" +
                    "5) Exit ");
            int query;
            Scanner a = new Scanner(System.in);
            query = a.nextInt();

            if(query == 1)                                                                //Query1 Starts
            {
                System.out.println("Choose Restaurant");
                for (int i = 0; i < zotato.getRestro_arr().size(); i++) {
                    System.out.println(i + ") " + zotato.getRestro_arr().get(i).getName()+ zotato.getRestro_arr().get(i).getType());}

            int query1_a;
            Scanner a1 = new Scanner(System.in);
            query1_a = a1.nextInt();

            boolean temprest = true;
            while(temprest){
            System.out.println("Welcome " + zotato.getRestro_arr().get(query1_a).getName() +"\n"+"1) Add item\n" +
                    "2) Edit item\n" +
                    "3) Print Rewards\n" +
                    "4) Discount on bill value\n" +
                    "5) Exit");

            int query1_b;
            Scanner a1b = new Scanner(System.in);
            query1_b = a1b.nextInt();

            if(query1_b==1)
            {
                System.out.println("Enter food item details ");
                System.out.println("Food name: ");
                Scanner a1c = new Scanner((System.in));
                String food_name = a1c.next();
                System.out.println("item Price:");
                int food_price = a1c.nextInt();
                System.out.println("item Quantity:");
                int food_quantity = a1c.nextInt();
                System.out.println("Category:");
                String food_category = a1c.next();
                System.out.println("offer:");
                int food_offer = a1c.nextInt();

                fooditem x = new fooditem(food_name,food_price,food_quantity,food_offer,food_category);
                zotato.getRestro_arr().get(query1_a).addMenu(x);
                System.out.println(x.getId()+" "+x.getName()+" "+x.getPrice()+" "+x.getQuantity()+ " " +x.getDiscount()+"% OFF "+x.getCategory());
            }


            else if(query1_b==2)
            {
                System.out.println("Choose item by code");
                for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                    System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                            + zotato.getRestro_arr().get(query1_a).getName()
                            + " - "
                            + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                            + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                            + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                            + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                            + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                }
                    int query_foodid;
                    Scanner a1b2a = new Scanner(System.in);
                    query_foodid = a1b2a.nextInt();
                    System.out.println("Choose an attribute to edit:\n" +
                            "1) Name\n" +
                            "2) Price\n" +
                            "3) Quantity\n" +
                            "4) Category\n" +
                            "5) Offer");

                    int query1_b2a1;
                    Scanner a1b2a1 = new Scanner(System.in);
                    query1_b2a1 = a1b2a1.nextInt();

                    if (query1_b2a1==1)
                    {
                        String query1_b2a2;
                        Scanner a1b2a2 = new Scanner(System.in);
                        System.out.print("Enter the new name - ");
                        query1_b2a2 = a1b2a2.next();

                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                        if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid)
                        {zotato.getRestro_arr().get(query1_a).getMenu().get(i).setName(query1_b2a2);}
                        }
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                                    + zotato.getRestro_arr().get(query1_a).getName() + " - "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                        }
                    }

                    else if(query1_b2a1==2)
                    {
                        int query1_b2a2;
                        Scanner a1b2a2 = new Scanner(System.in);
                        System.out.print("Enter the new price - ");
                        query1_b2a2 = a1b2a2.nextInt();
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid)
                            {zotato.getRestro_arr().get(query1_a).getMenu().get(i).setPrice(query1_b2a2);}
                        }
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                                    + zotato.getRestro_arr().get(query1_a).getName() + " - "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                        }

                    }
                    else if(query1_b2a1==3)
                    {
                        int query1_b2a2;
                        Scanner a1b2a2 = new Scanner(System.in);
                        System.out.print("Enter the new quantity - ");
                        query1_b2a2 = a1b2a2.nextInt();
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid)
                            {zotato.getRestro_arr().get(query1_a).getMenu().get(i).setQuantity(query1_b2a2);}
                        }
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                                    + zotato.getRestro_arr().get(query1_a).getName() + " - "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                        }
                    }
                    else if(query1_b2a1==4)
                    {
                        String query1_b2a2;
                        Scanner a1b2a2 = new Scanner(System.in);
                        System.out.print("Enter the new Category - ");
                        query1_b2a2 = a1b2a2.next();
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid)
                            {zotato.getRestro_arr().get(query1_a).getMenu().get(i).setCategory(query1_b2a2);}
                        }
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                                    + zotato.getRestro_arr().get(query1_a).getName() + " - "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                        }
                    }
                    else if(query1_b2a1==5)
                    {
                        int query1_b2a2;
                        Scanner a1b2a2 = new Scanner(System.in);
                        System.out.print("Enter the new offer - ");
                        query1_b2a2 = a1b2a2.nextInt();
                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid)
                            {zotato.getRestro_arr().get(query1_a).getMenu().get(i).setDiscount(query1_b2a2);}}

                        for(int i= 0; i<zotato.getRestro_arr().get(query1_a).getMenu().size();i++) {
                            if (zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId()==query_foodid){
                            System.out.println(zotato.getRestro_arr().get(query1_a).getMenu().get(i).getId() + " "
                                    + zotato.getRestro_arr().get(query1_a).getName() + " - "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getName() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getPrice() + " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getDiscount() + "% OFF "
                                    + zotato.getRestro_arr().get(query1_a).getMenu().get(i).getCategory());
                        }}
                    }



            }


            else if(query1_b==3)
            {
                System.out.println("Reward Points:"+zotato.getRestro_arr().get(query1_a).getRewardPoints());
            }

            else if(query1_b==4)
            {

                int query4a;
                Scanner a4 = new Scanner(System.in);
                System.out.print("Enter Discount on bill - ");
                query4a = a4.nextInt();
                zotato.getRestro_arr().get(query1_a).setDiscountOnBill(query4a);
                System.out.println("Discount on bill- "+zotato.getRestro_arr().get(query1_a).getDiscountOnBill() + "% OFF");

            }

            else if(query1_b==5)
            {
                temprest = false;
            }

        }
    }                                                                            //Query 1 Ends






            else if(query==2)                                                    //Query 2 Starts
            {
                for (int i = 0; i < zotato.getCustomer_arr().size(); i++) {
                    System.out.println(i + ") " + zotato.getCustomer_arr().get(i).getName()+ zotato.getCustomer_arr().get(i).getType());}

                int customerIDQ;
                Scanner a2 = new Scanner(System.in);
                customerIDQ = a2.nextInt();

                cart x = new cart();

                boolean temprest = true;
                while(temprest)
                {

                    System.out.println("Welcome "+ zotato.getCustomer_arr().get(customerIDQ).getName()+"\n" + "Customer Menu\n" +
                            "1) Select Restaurant\n" +
                            "2) checkout cart\n" +
                            "3) Reward won\n" +
                            "4) print the recent orders\n" +
                            "5) Exit" );


                    int customerMenuQ;
                    Scanner a2a = new Scanner(System.in);
                    customerMenuQ = a2a.nextInt();

                    if(customerMenuQ==1)
                    {
                        System.out.println("Choose Restaurant");
                        for (int i1 = 0; i1 < zotato.getRestro_arr().size(); i1++) {
                            System.out.println(i1 + ") " + zotato.getRestro_arr().get(i1).getName()+ zotato.getRestro_arr().get(i1).getType());}

                        int customerRestroQ;
                        Scanner a2b = new Scanner(System.in);
                        customerRestroQ = a2b.nextInt();

                        System.out.println("Choose item by Code ");

                        for (int i2 = 0; i2 < zotato.getRestro_arr().get(customerRestroQ).getMenu().size(); i2++) {
                            System.out.println(zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getId() + " "
                                    + zotato.getRestro_arr().get(customerRestroQ).getName() + " - "
                                    + zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getName()+ " "
                                    + zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getPrice()+ " "
                                    + zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getQuantity()+ " "
                                    + zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getDiscount() + "% OFF"
                                    + zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getCategory())
                            ;}

                        int addItemQ;
                        int quantityQ;
                        Scanner a2c = new Scanner(System.in);
                        addItemQ = a2c.nextInt();
                        System.out.println("add item quantity -");
                        quantityQ = a2c.nextInt();


                        for(int i2 =0; i2<zotato.getRestro_arr().get(customerRestroQ).getMenu().size();i2++) {
                            if (zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getQuantity() >= quantityQ) {
                                if (zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).getId() == addItemQ) {
                                    x.addCurrent(zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2), quantityQ, zotato.getRestro_arr().get(customerRestroQ).getName());
                                    zotato.getRestro_arr().get(customerRestroQ).getMenu().get(i2).setQuantity(quantityQ, "deduct");
                                    System.out.println("item added to cart");
                                }
                            }
                            else
                            {
                                System.out.println("needed quantity exceeded available quantity");
                            }
                        }

                    }


                    else if(customerMenuQ==2)
                    {
                        double orderValue;
                        double foodTotal;
                        foodTotal = 0;
                        System.out.println("Items in Cart -");
                        for (int i1=0; i1 < x.getCurrent().size();i1++){
                            System.out.println(x.getCurrent().get(i1).getId() + " "
                                    + x.getCurrent().get(i1).getRestroname() +" - "
                                    + x.getCurrent().get(i1).getName() + " - "
                                    + x.getCurrent().get(i1).getPrice() + " - "
                                    + x.getCurrent().get(i1).getQuantity() + " - "
                                    + x.getCurrent().get(i1).getDiscount() + "% OFF");

                            foodTotal = foodTotal + (x.getCurrent().get(i1).getQuantity() * (x.getCurrent().get(i1).getPrice()-((x.getCurrent().get(i1).getPrice()*x.getCurrent().get(i1).getDiscount()/100)) ));
                            }
                        //System.out.println("f" + foodTotal);
                        System.out.println("Delivery Charge - " + zotato.getCustomer_arr().get(customerIDQ).getDeliverycharge()+"/-" );

                        int dOnBill = 0;

                        for(int i3=0; i3<zotato.getRestro_arr().size();i3++)
                        {
                            if(x.getCurrent().get(0).getRestroname().equals(zotato.getRestro_arr().get(i3).getName()))
                            {
                                dOnBill = zotato.getRestro_arr().get(i3).getDiscountOnBill();
                            }
                        }
                        foodTotal = foodTotal - (foodTotal* dOnBill/100);
                        orderValue = foodTotal + zotato.getCustomer_arr().get(customerIDQ).getDeliverycharge();

                        if(orderValue>=200)
                        {orderValue = orderValue - zotato.getCustomer_arr().get(customerIDQ).getPremiumDiscount();}
                        //System.out.println("re "+ );
                        //System.out.println("food total: " + foodTotal);
                        System.out.println("Order Value- "+ orderValue+"/-");


                        int checkout;
                        Scanner a2c = new Scanner(System.in);
                        System.out.println("press 1 to checkout");
                        checkout = a2c.nextInt();

                        if (checkout == 1)
                        {
                          if((zotato.getCustomer_arr().get(customerIDQ).getWalletBalance() +
                                  zotato.getCustomer_arr().get(customerIDQ).getRewardpoints()) >= orderValue)
                          {
                            orderValue -= zotato.getCustomer_arr().get(customerIDQ).getRewardpoints();
                            zotato.getCustomer_arr().get(customerIDQ).setWalletBalance(orderValue);
                            //double rewardPoints;
                            if (zotato.getCustomer_arr().get(customerIDQ).getType().equals("Normal"))
                            {
                                if (orderValue>=100)
                                {
                                    double rewardPoints = orderValue / zotato.getRestro_arr().get(customerIDQ).getReward();
                                    zotato.addDeliverycharge(zotato.getCustomer_arr().get(customerIDQ).getDeliverycharge());
                                    zotato.getCustomer_arr().get(customerIDQ).setRewardpoints(rewardPoints,"add");
                                    for(int i3=0; i3<zotato.getRestro_arr().size();i3++)
                                    {
                                        if(x.getCurrent().get(0).getRestroname().equals(zotato.getRestro_arr().get(i3).getName()))
                                        {
                                            zotato.getRestro_arr().get(i3).setRewardPoints(rewardPoints);
                                            zotato.getRestro_arr().get(i3).setTotalOrders();
                                        }
                                    }
                                }
                            }
                            else if (zotato.getCustomer_arr().get(customerIDQ).getType().equals("Elite"))
                            {
                                if (orderValue>=200)
                                {
                                    double rewardPoints = orderValue / zotato.getRestro_arr().get(customerIDQ).getReward();
                                    zotato.addDeliverycharge(zotato.getCustomer_arr().get(customerIDQ).getDeliverycharge());
                                    zotato.getCustomer_arr().get(customerIDQ).setRewardpoints(rewardPoints,"add");
                                    for(int i3=0; i3<zotato.getRestro_arr().size();i3++)
                                    {
                                        if(x.getCurrent().get(0).getRestroname().equals(zotato.getRestro_arr().get(i3).getName()))
                                        {
                                            zotato.getRestro_arr().get(i3).setRewardPoints(rewardPoints);
                                            zotato.getRestro_arr().get(i3).setTotalOrders();
                                        }
                                    }
                                }
                            }
                            else if (zotato.getCustomer_arr().get(customerIDQ).getType().equals("Special"))
                            {
                                if (orderValue>=150)
                                {
                                    double rewardPoints = orderValue / zotato.getRestro_arr().get(customerIDQ).getReward();

                                    zotato.addDeliverycharge(zotato.getCustomer_arr().get(customerIDQ).getDeliverycharge());
                                    zotato.getCustomer_arr().get(customerIDQ).setRewardpoints(rewardPoints,"add");
                                    for(int i3=0; i3<zotato.getRestro_arr().size();i3++)
                                    {
                                        if(x.getCurrent().get(0).getRestroname().equals(zotato.getRestro_arr().get(i3).getName()))
                                        {
                                            zotato.getRestro_arr().get(i3).setRewardPoints(rewardPoints);
                                            zotato.getRestro_arr().get(i3).setTotalOrders();
                                        }
                                    }
                                }
                            }


                            double f =  0.01*orderValue;
                            zotato.addAccountBalance((f));




                              int totalQuantity = 0;
                              for (int i1=0; i1 < x.getCurrent().size();i1++)
                              {
                                  totalQuantity += x.getCurrent().get(i1).getQuantity();
                              }
                              System.out.println(totalQuantity + " items Successfully ordered for INR " + orderValue + "/-");

                              x.setPrevious(x.getCurrent());
                              x.getCurrent().clear();

                          }
                        }


                    }

                    else if (customerMenuQ==3)
                    {
                        System.out.println("Reward Won - \n" + zotato.getCustomer_arr().get(customerIDQ).getRewardpoints());
                    }

                    else if(customerMenuQ==4)
                    {
                        for (int i5=0; i5 < x.getPrevious().size();i5++){
                            System.out.println(x.getPrevious().get(i5).getId() + " "
                                    + x.getPrevious().get(i5).getRestroname() +" - "
                                    + x.getPrevious().get(i5).getName() + " - "
                                    + x.getPrevious().get(i5).getPrice() + " - "
                                    + x.getPrevious().get(i5).getQuantity() + " - "
                                    + x.getPrevious().get(i5).getDiscount() + " % OFF"
                            );}
                    }

                    else if (customerMenuQ==5)
                    {
                        break;
                    }



                }



            }









            else if(query==3)                                                          //Query3 Start
            {
                System.out.println("1) Customer List\n" + "2) Restaurant List");
                int query3_a;
                Scanner a3 = new Scanner(System.in);
                query3_a = a.nextInt();
                if(query3_a==1)
                {
                    for (int i = 0; i < zotato.getCustomer_arr().size(); i++) {
                        System.out.println(i + ") " + zotato.getCustomer_arr().get(i).getName());}

                    int query3_b;
                    Scanner a3b = new Scanner(System.in);
                    query3_b = a.nextInt();

                    System.out.println(zotato.getCustomer_arr().get(query3_b).getName()+
                            zotato.getCustomer_arr().get(query3_b).getType()+", "+zotato.getCustomer_arr().get(query3_b).getAddress()+", "+zotato.getCustomer_arr().get(query3_b).getWalletBalance()+"\n");

                }
                else if(query3_a==2)
                {
                    for (int i = 0; i < zotato.getRestro_arr().size(); i++) {
                        System.out.println(i + ") " + zotato.getRestro_arr().get(i).getName());}

                    int query3_b;
                    Scanner a3b = new Scanner(System.in);
                    query3_b = a.nextInt();

                    System.out.println(zotato.getRestro_arr().get(query3_b).getName()+", "+zotato.getRestro_arr().get(query3_b).getAddress()+"\n");
                }

            }                                                                                  //query3 ends








            else if(query==4)                                   //Query4 Starts
            {
                System.out.println("Total Company Balance- "+ zotato.getAccountBalance());
                System.out.println("Total Delivery charge- " + zotato.getDeliveryCharge() + "\n");
            }                                                   //Query 4 Ends








            else if(query==5)                        //Query5 Starts
            {
                temp = false;
            }                                        //Query5 Ends
        }
    }

}