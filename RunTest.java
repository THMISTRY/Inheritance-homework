package inheritancehomework;


public class RunTest {

    public static void main(String[] args) {
        System.out.println("Parent Class - Mobile Phones");
        MobilePhones mobilePhones = new MobilePhones();
        mobilePhones.communication();
        mobilePhones.checkingmails();
        mobilePhones.takingpictures();
        mobilePhones.messaging();
        mobilePhones.browsing();

        System.out.println("Child Class - Nokia");
        Nokia nokia = new Nokia();
        nokia.communication();
        nokia.checkingmails();
        nokia.takingpictures();
        nokia.messaging();
        nokia.browsing();

        System.out.println("Child Class - Samsung");
        Samsung samsung = new Samsung();
        samsung.communication();
        samsung.checkingmails();
        samsung.takingpictures();
        samsung.messaging();
        samsung.browsing();

        System.out.println("Child Class - Iphone");
        Iphone iphone = new Iphone();
        iphone.communication();
        iphone.checkingmails();
        iphone.takingpictures();
        iphone.messaging();
        iphone.browsing();

        System.out.println("Parent Class - Communication Device");
        CommunicationDevices communicationDevices = new CommunicationDevices();
        communicationDevices.screensize();
        communicationDevices.charingtime();
        communicationDevices.storagecapacity();
        communicationDevices.price();

        System.out.println("Child Class - Tablet");
        Tablet tablet = new Tablet();
        tablet.screensize();
        tablet.charingtime();
        tablet.storagecapacity();
        tablet.price();

    }

}


