package org.example.init;

import org.example.dtos.*;
import org.example.models.enums.*;
import org.example.services.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;

@Component
public class CommandLineRunnerImpl implements CommandLineRunner {

    @Autowired
    private UserService userService;
    @Autowired
    private UserRoleService userRoleService;
    @Autowired
    private CarModelService carModelService;
    @Autowired
    private CarBrandService carBrandService;
    @Autowired
    private OfferService offerService;

    @Transactional
    public void createData() {

        CarBrandDTO brand1 = carBrandService.createCarBrand(new CarBrandDTO("Toyota"));
        CarBrandDTO brand2 = carBrandService.createCarBrand(new CarBrandDTO("BMW"));
        CarBrandDTO brand3 = carBrandService.createCarBrand(new CarBrandDTO("Audi"));
        CarBrandDTO brand4 = carBrandService.createCarBrand(new CarBrandDTO("Mercedes-Benz"));
        CarBrandDTO brand5 = carBrandService.createCarBrand(new CarBrandDTO("Ford"));
        CarBrandDTO brand6 = carBrandService.createCarBrand(new CarBrandDTO("Honda"));
        CarBrandDTO brand7 = carBrandService.createCarBrand(new CarBrandDTO("Nissan"));
        CarBrandDTO brand8 = carBrandService.createCarBrand(new CarBrandDTO("Chevrolet"));
        CarBrandDTO brand9 = carBrandService.createCarBrand(new CarBrandDTO("Volkswagen"));
        CarBrandDTO brand10 = carBrandService.createCarBrand(new CarBrandDTO("Hyundai"));
        CarBrandDTO brand11 = carBrandService.createCarBrand(new CarBrandDTO("Kia"));
        CarBrandDTO brand12 = carBrandService.createCarBrand(new CarBrandDTO("Subaru"));
        CarBrandDTO brand13 = carBrandService.createCarBrand(new CarBrandDTO("Lexus"));
        CarBrandDTO brand14 = carBrandService.createCarBrand(new CarBrandDTO("Mazda"));
        CarBrandDTO brand15 = carBrandService.createCarBrand(new CarBrandDTO("Porsche"));
        CarBrandDTO brand16 = carBrandService.createCarBrand(new CarBrandDTO("Jaguar"));
        CarBrandDTO brand17 = carBrandService.createCarBrand(new CarBrandDTO("Land Rover"));
        CarBrandDTO brand18 = carBrandService.createCarBrand(new CarBrandDTO("Tesla"));
        CarBrandDTO brand19 = carBrandService.createCarBrand(new CarBrandDTO("Acura"));
        CarBrandDTO brand20 = carBrandService.createCarBrand(new CarBrandDTO("Volvo"));

        CarModelDTO model1 = carModelService.createCarModel(new CarModelDTO("Camry", ModelCategory.CAR, "imageUrl1", 1990, 2021, brand1));
        CarModelDTO model2 = carModelService.createCarModel(new CarModelDTO("X5", ModelCategory.TRUCK, "imageUrl2", 2000, 2021, brand2));
        CarModelDTO model3 = carModelService.createCarModel(new CarModelDTO("Corolla", ModelCategory.CAR, "imageUrl3", 1995, 2021, brand1));
        CarModelDTO model4 = carModelService.createCarModel(new CarModelDTO("A4", ModelCategory.CAR, "imageUrl4", 1998, 2021, brand3));
        CarModelDTO model5 = carModelService.createCarModel(new CarModelDTO("E-Class", ModelCategory.CAR, "imageUrl5", 2001, 2021, brand4));
        CarModelDTO model6 = carModelService.createCarModel(new CarModelDTO("Focus", ModelCategory.CAR, "imageUrl6", 2003, 2021, brand5));
        CarModelDTO model7 = carModelService.createCarModel(new CarModelDTO("Civic", ModelCategory.CAR, "imageUrl7", 2005, 2021, brand6));
        CarModelDTO model8 = carModelService.createCarModel(new CarModelDTO("Altima", ModelCategory.CAR, "imageUrl8", 2008, 2021, brand7));
        CarModelDTO model9 = carModelService.createCarModel(new CarModelDTO("Cruze", ModelCategory.CAR, "imageUrl9", 2010, 2021, brand8));
        CarModelDTO model10 = carModelService.createCarModel(new CarModelDTO("Jetta", ModelCategory.CAR, "imageUrl10", 2012, 2021, brand9));
        CarModelDTO model11 = carModelService.createCarModel(new CarModelDTO("Elantra", ModelCategory.CAR, "imageUrl11", 2014, 2021, brand10));
        CarModelDTO model12 = carModelService.createCarModel(new CarModelDTO("Sorento", ModelCategory.CAR, "imageUrl12", 2016, 2021, brand11));
        CarModelDTO model13 = carModelService.createCarModel(new CarModelDTO("Outback", ModelCategory.CAR, "imageUrl13", 2018, 2021, brand12));
        CarModelDTO model14 = carModelService.createCarModel(new CarModelDTO("RX 350", ModelCategory.CAR, "imageUrl14", 2020, 2021, brand13));
        CarModelDTO model15 = carModelService.createCarModel(new CarModelDTO("CX-5", ModelCategory.CAR, "imageUrl15", 2022, 2021, brand14));
        CarModelDTO model16 = carModelService.createCarModel(new CarModelDTO("911", ModelCategory.CAR, "imageUrl16", 2024, 2021, brand15));
        CarModelDTO model17 = carModelService.createCarModel(new CarModelDTO("F-PACE", ModelCategory.CAR, "imageUrl17", 2026, 2021, brand16));
        CarModelDTO model18 = carModelService.createCarModel(new CarModelDTO("Range Rover Sport", ModelCategory.CAR, "imageUrl18", 2028, 2021, brand17));
        CarModelDTO model19 = carModelService.createCarModel(new CarModelDTO("Model S", ModelCategory.CAR, "imageUrl19", 2030, 2021, brand18));
        CarModelDTO model20 = carModelService.createCarModel(new CarModelDTO("XC60", ModelCategory.CAR, "imageUrl20", 2032, 2021, brand19));

        UserRoleDTO userRole = userRoleService.createUserRole(new UserRoleDTO(UserRoleType.USER));
        UserRoleDTO adminRole = userRoleService.createUserRole(new UserRoleDTO(UserRoleType.ADMIN));

        UserDTO user1 = userService.createUser(new UserDTO("username3", "password3", "User3", "Doe", true, "userImageUrl3", userRole));
        UserDTO user2 = userService.createUser(new UserDTO("username4", "password4", "User4", "Doe", true, "userImageUrl4", userRole));
        UserDTO user3 = userService.createUser(new UserDTO("username5", "password5", "User5", "Doe", true, "userImageUrl5", userRole));
        UserDTO user4 = userService.createUser(new UserDTO("username6", "password6", "User6", "Doe", true, "userImageUrl6", userRole));
        UserDTO user5 = userService.createUser(new UserDTO("username7", "password7", "User7", "Doe", true, "userImageUrl7", userRole));
        UserDTO user6 = userService.createUser(new UserDTO("username8", "password8", "User8", "Doe", true, "userImageUrl8", userRole));
        UserDTO user7 = userService.createUser(new UserDTO("username9", "password9", "User9", "Doe", true, "userImageUrl9", userRole));
        UserDTO user8 = userService.createUser(new UserDTO("username10", "password10", "User10", "Doe", true, "userImageUrl10", userRole));
        UserDTO user9 = userService.createUser(new UserDTO("username11", "password11", "User11", "Doe", true, "userImageUrl11", userRole));
        UserDTO user10 = userService.createUser(new UserDTO("username12", "password12", "User12", "Doe", true, "userImageUrl12", userRole));
        UserDTO user11 = userService.createUser(new UserDTO("username13", "password13", "User13", "Doe", true, "userImageUrl13", userRole));
        UserDTO user12 = userService.createUser(new UserDTO("username14", "password14", "User14", "Doe", true, "userImageUrl14", userRole));
        UserDTO user13 = userService.createUser(new UserDTO("username15", "password15", "User15", "Doe", true, "userImageUrl15", userRole));
        UserDTO user14 = userService.createUser(new UserDTO("username16", "password16", "User16", "Doe", true, "userImageUrl16", userRole));
        UserDTO user15 = userService.createUser(new UserDTO("username17", "password17", "User17", "Doe", true, "userImageUrl17", userRole));
        UserDTO user16 = userService.createUser(new UserDTO("username18", "password18", "User18", "Doe", true, "userImageUrl18", userRole));
        UserDTO user17 = userService.createUser(new UserDTO("username19", "password19", "User19", "Doe", true, "userImageUrl19", userRole));
        UserDTO user18 = userService.createUser(new UserDTO("username20", "password20", "User20", "Doe", true, "userImageUrl20", userRole));
        UserDTO admin = userService.createUser(new UserDTO("admin", "adminPass", "Admin", "Admin", true, "adminImageUrl", adminRole));

        OfferDTO offerDTO1 = offerService.createOffer(new OfferDTO("Description1", EngineType.GASOLINE, "offerImageUrl1", 50000, new BigDecimal("10000.00"), TransmissionType.AUTOMATIC, 2018, model1, user1));
        OfferDTO offerDTO2 = offerService.createOffer(new OfferDTO("Description2", EngineType.DIESEL, "offerImageUrl2", 60000, new BigDecimal("15000.00"), TransmissionType.MANUAL, 2019, model2, user2));
        OfferDTO offerDTO3 = offerService.createOffer(new OfferDTO("Description3", EngineType.ELECTRIC, "offerImageUrl3", 10000, new BigDecimal("25000.00"), TransmissionType.AUTOMATIC, 2020, model3, admin));
        OfferDTO offerDTO4 = offerService.createOffer(new OfferDTO("Description4", EngineType.GASOLINE, "offerImageUrl4", 55000, new BigDecimal("10500.00"), TransmissionType.AUTOMATIC, 2017, model4, user3));
        OfferDTO offerDTO5 = offerService.createOffer(new OfferDTO("Description5", EngineType.DIESEL, "offerImageUrl5", 62000, new BigDecimal("15500.00"), TransmissionType.MANUAL, 2018, model5, user4));
        OfferDTO offerDTO6 = offerService.createOffer(new OfferDTO("Description6", EngineType.GASOLINE, "offerImageUrl6", 59000, new BigDecimal("11000.00"), TransmissionType.AUTOMATIC, 2016, model6, user5));
        OfferDTO offerDTO7 = offerService.createOffer(new OfferDTO("Description7", EngineType.DIESEL, "offerImageUrl7", 68000, new BigDecimal("16000.00"), TransmissionType.MANUAL, 2015, model7, user6));
        OfferDTO offerDTO8 = offerService.createOffer(new OfferDTO("Description8", EngineType.GASOLINE, "offerImageUrl8", 51000, new BigDecimal("10000.00"), TransmissionType.AUTOMATIC, 2013, model8, user7));
        OfferDTO offerDTO9 = offerService.createOffer(new OfferDTO("Description9", EngineType.DIESEL, "offerImageUrl9", 63000, new BigDecimal("15000.00"), TransmissionType.MANUAL, 2012, model9, user8));
        OfferDTO offerDTO10 = offerService.createOffer(new OfferDTO("Description10", EngineType.GASOLINE, "offerImageUrl10", 57000, new BigDecimal("11500.00"), TransmissionType.AUTOMATIC, 2010, model10, user9));
        OfferDTO offerDTO11 = offerService.createOffer(new OfferDTO("Description11", EngineType.DIESEL, "offerImageUrl11", 61000, new BigDecimal("15500.00"), TransmissionType.MANUAL, 2008, model11, user10));
        OfferDTO offerDTO12 = offerService.createOffer(new OfferDTO("Description12", EngineType.GASOLINE, "offerImageUrl12", 54000, new BigDecimal("10000.00"), TransmissionType.AUTOMATIC, 2006, model12, user11));
        OfferDTO offerDTO13 = offerService.createOffer(new OfferDTO("Description13", EngineType.DIESEL, "offerImageUrl13", 67000, new BigDecimal("16000.00"), TransmissionType.MANUAL, 2004, model13, user12));
        OfferDTO offerDTO14 = offerService.createOffer(new OfferDTO("Description14", EngineType.GASOLINE, "offerImageUrl14", 52000, new BigDecimal("10500.00"), TransmissionType.AUTOMATIC, 2002, model14, user13));
        OfferDTO offerDTO15 = offerService.createOffer(new OfferDTO("Description15", EngineType.DIESEL, "offerImageUrl15", 65000, new BigDecimal("15500.00"), TransmissionType.MANUAL, 2000, model15, user14));
        OfferDTO offerDTO16 = offerService.createOffer(new OfferDTO("Description16", EngineType.GASOLINE, "offerImageUrl16", 53000, new BigDecimal("11000.00"), TransmissionType.AUTOMATIC, 1998, model16, user15));
        OfferDTO offerDTO17 = offerService.createOffer(new OfferDTO("Description17", EngineType.DIESEL, "offerImageUrl17", 66000, new BigDecimal("16500.00"), TransmissionType.MANUAL, 1996, model17, user16));
        OfferDTO offerDTO18 = offerService.createOffer(new OfferDTO("Description18", EngineType.GASOLINE, "offerImageUrl18", 56000, new BigDecimal("10500.00"), TransmissionType.AUTOMATIC, 1994, model18, user17));
        OfferDTO offerDTO19 = offerService.createOffer(new OfferDTO("Description19", EngineType.DIESEL, "offerImageUrl19", 64000, new BigDecimal("15500.00"), TransmissionType.MANUAL, 1992, model19, user18));
        OfferDTO offerDTO20 = offerService.createOffer(new OfferDTO("Description20", EngineType.GASOLINE, "offerImageUrl20", 55000, new BigDecimal("10000.00"), TransmissionType.AUTOMATIC, 1990, model20, admin));

    }

    @Override
    public void run(String... args) throws Exception {
        createData();

        // Создание и чтение CarBrand
        CarBrandDTO carBrandDTO = carBrandService.createCarBrand(new CarBrandDTO("AAAAAAAAAA"));
        System.out.println("Создана марка автомобиля: " + carBrandDTO);

        CarBrandDTO readCarBrand = carBrandService.getCarBrandById(carBrandDTO.getId());
        System.out.println("Прочитана марка автомобиля: " + readCarBrand);

        // Обновление CarBrand
        carBrandDTO.setName("Updated AAAAAAAAAA");
        carBrandDTO = carBrandService.createCarBrand(carBrandDTO);
        System.out.println("Обновлена марка автомобиля: " + carBrandDTO);

//        // Удаление CarBrand
//        carBrandService.deleteCarBrand(carBrandDTO.getId());
//        System.out.println("Удалена марка автомобиля с ID: " + carBrandDTO.getId());

        // Создание и чтение CarModel
        CarBrandDTO brandDTO = carBrandService.createCarBrand(new CarBrandDTO("Toyotaaaaaaaaaaaaaaaaaaaa"));

        CarModelDTO carModelDTO = carModelService.createCarModel(new CarModelDTO("Camryyyyyyyyyyyyyyyyyy", ModelCategory.CAR, "imageUrl1", 1990, 2021, brandDTO));
        System.out.println("Создана модель автомобиля с ID: " + carModelDTO.getId());

        CarModelDTO readCarModel = carModelService.getCarModelById(carModelDTO.getId());
        System.out.println("Прочитана модель автомобиля с ID: " + readCarModel.getId());

        // Обновление CarModel
        carModelDTO.setName("Updated Camryyyyyyyyyyyyyyyyyyyyy");
        carModelDTO = carModelService.createCarModel(carModelDTO);
        System.out.println("Обновлена модель автомобиля с ID: " + carModelDTO.getId());

//        // Удаление CarModel
//        carModelService.deleteCarModel(carModelDTO.getId());
//        System.out.println("Удалена модель автомобиля с ID: " + carModelDTO.getId());

        // Создание и чтение UserRole
        UserRoleDTO userRoleDTO = userRoleService.createUserRole(new UserRoleDTO(UserRoleType.USER));
        System.out.println("Создана роль пользователя: " + userRoleDTO);

        UserRoleDTO readUserRole = userRoleService.getUserRoleById(userRoleDTO.getId());
        System.out.println("Прочитана роль пользователя: " + readUserRole);

        // Создание и чтение User
        UserDTO userDTO = new UserDTO("Rayan", "ssssssssaaaaaa", "sas", "asa", true, "7777777777", userRoleDTO);
        userDTO = userService.createUser(userDTO);
        System.out.println("Создан пользователь с ID: " + userDTO.getId());

        UserDTO readUser = userService.getUserById(userDTO.getId());
        System.out.println("Прочитан пользователь: " + readUser.getId());

        // Обновление User
        userDTO.setFirstName("Updated User");
        userDTO = userService.updateUser(userDTO.getId(), userDTO);
        System.out.println("Обновлен пользователь с ID: " + userDTO.getId());

//        // Удаление UserRole
//        userRoleService.deleteUserRole(userRoleDTO.getId());
//        System.out.println("Удалена роль пользователя с ID: " + userRoleDTO.getId());

//        // Удаление User
//        userService.deleteUser(userDTO.getId());
//        System.out.println("Удален пользователь с ID: " + userDTO.getId());

        OfferDTO offerDTO = new OfferDTO("Description777", EngineType.GASOLINE, "offerImageUrl1", 50000, new BigDecimal("10000.00"), TransmissionType.AUTOMATIC, 2018, carModelDTO, userDTO);
        offerDTO = offerService.createOffer(offerDTO);
        System.out.println("Создано предложение: " + offerDTO);

        OfferDTO readOffer = offerService.getOfferById(offerDTO.getId());
        System.out.println("Прочитано предложение: " + readOffer);

//        // Удаление Offer
//        offerService.deleteOffer(offerDTO.getId());
//        System.out.println("Удалено предложение с ID: " + offerDTO.getId());

        System.out.println("Brand Model Counts:");
        List<BrandModelCountDTO> brandModelCounts = carBrandService.getBrandModelCounts();
        for (BrandModelCountDTO brandModelCount : brandModelCounts) {
            System.out.println("Brand: " + brandModelCount.getName());
            System.out.println("Model Count: " + brandModelCount.getModelCount());
            System.out.println("---------------");
        }

        List<OfferDetailsDTO> offerDetails = offerService.getOfferDetails();

        for (OfferDetailsDTO offerDetail : offerDetails) {
            System.out.println("Description: " + offerDetail.getDescription());
            System.out.println("Price: " + offerDetail.getPrice());
            System.out.println("Year: " + offerDetail.getYear());
            System.out.println("Brand: " + offerDetail.getBrandName());
            System.out.println("Model: " + offerDetail.getModelName());
            System.out.println();
        }

        List<UserDTO> users = userService.findUsersByRole(UserRoleType.USER);
        System.out.println();
        for (UserDTO user : users) {
            System.out.println("User ID: " + user.getId());
            System.out.println("Username: " + user.getUsername());
            System.out.println();
        }

        List<OfferDTO> offerDTOS = offerService.getOfferByBrandName("Mazda");
        System.out.println();
        for (OfferDTO offerDTO1 : offerDTOS) {
            System.out.println(offerDTO1.toString());
            System.out.println();
        }

        List<OfferDTO> offerDTOS2 = offerService.getOfferByModelStartYearGreaterThane(2017);
        System.out.println();
        for (OfferDTO offerDTO1 : offerDTOS2) {
            System.out.println(offerDTO1.toString());
            System.out.println();
        }
    }
}

