package controller;

import model.entity.InternetPackagesEntity;
import model.service.InternetPackagesService;

import javax.swing.*;

public class InternetPackagesController {
    private static InternetPackagesController internetPackagesController = new InternetPackagesController();

    public static InternetPackagesController getInstance() {
        return internetPackagesController;
    }

    private InternetPackagesController() {

    }

    public void insert(String internetPackage) {
        try {
            InternetPackagesService.getInstance().save(new InternetPackagesEntity().setInternetPackage(internetPackage));
            BuyInternetPackages.jFram.dispose();
            JOptionPane.showMessageDialog(null, "Sign Up successfully");
            new MainSiteUsers();
        } catch (Exception e) {
            System.out.println("Fail to save!" + e.getMessage());
        }
    }

    public void select(String internetPackage, int id){
        try {
            String internetSize ;
            String internetPrice;
            InternetPackagesService.getInstance().save(new InternetPackagesEntity().setInternetPackage());
            if(id==1){
                internetSize=2;
                internetPrice=1000;
                InternetPackagesService.getInstance().save(new InternetPackagesEntity().setId(id).setInternetSize(internetSize).setInternetPrice(internetPrice));
            }else if (id==2){
                internetSize=4;
                internetPrice=2000;
                InternetPackagesService.getInstance().save(new InternetPackagesEntity().setId(id).setPrice(price).setInternet_size(internet_size));
            }else if (id==3){
                internetSize=10;
                internetPrice=5000;
                Bastser.getInstance().save(new Bastent().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }else if (id==4){
                internetSize=25;
                internetPrice=10000;
                Bastser.getInstance().save(new Bastent().setId(id).setUsername(username).setPass(pass).setPrice(price).setInternet_size(internet_size));
            }
        }catch (Exception e){
            System.out.println("fail! " + e.getMessage());
        }
    }
    public void show(){
        System.out.println("pls choose a choice :\n1-2G:1000 tomans\n2-4G:2000 tomans\n3-10G:5000 tomans\n4-25G:10000 tomans");

    }
}
