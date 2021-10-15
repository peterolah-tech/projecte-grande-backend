package com.codecool.projectegrandebackend.configuration;

import com.codecool.projectegrandebackend.model.Airport;
import com.codecool.projectegrandebackend.repository.AirportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import java.util.HashSet;
import java.util.Set;

@Component
public class AirportsFactory {

    @Autowired
    private AirportRepository airportRepository;

    public void saveCreatedAirports() {
        Set<Airport> airports = createAirports();
        airportRepository.saveAll(airports);
    }

    private Set<Airport> createAirports() {
        Set<Airport> createdAirports = new HashSet<>();
        Airport airport01 = Airport.builder()
                .name("Adolfo Suárez Madrid–Barajas Airport")
                .latitude(40.471926)
                .longitude(-3.56264)
                .municipality("Madrid")
                .iataCode("MAD")
                .build();
        createdAirports.add(airport01);
        Airport airport02 = Airport.builder()
                .name("Dubai International Airport")
                .latitude(25.2527999878)
                .longitude(55.3643989563)
                .municipality("Dubai")
                .iataCode("DXB")
                .build();
        createdAirports.add(airport02);
        Airport airport03 = Airport.builder()
                .name("Copenhagen Kastrup Airport")
                .latitude(55.617900848389)
                .longitude(12.656000137329)
                .municipality("Copenhagen")
                .iataCode("CPH")
                .build();
        createdAirports.add(airport03);
        Airport airport04 = Airport.builder()
                .name("İstanbul Atatürk Airport")
                .latitude(40.976898)
                .longitude(28.8146)
                .municipality("Bakırköy, Istanbul")
                .iataCode("ISL")
                .build();
        createdAirports.add(airport04);
        Airport airport05 = Airport.builder()
                .name("Frankfurt am Main Airport")
                .latitude(50.033333)
                .longitude(8.570556)
                .municipality("Frankfurt am Main")
                .iataCode("FRA")
                .build();
        createdAirports.add(airport05);
        Airport airport06 = Airport.builder()
                .name("Charles de Gaulle International Airport")
                .latitude(49.012798)
                .longitude(2.55)
                .municipality("Paris")
                .iataCode("CDG")
                .build();
        createdAirports.add(airport06);
        Airport airport07 = Airport.builder()
                .name("Guangzhou Baiyun International Airport")
                .latitude(23.392401)
                .longitude(113.299004)
                .municipality("Guangzhou (Huadu)")
                .iataCode("CAN")
                .build();
        createdAirports.add(airport07);
        Airport airport08 = Airport.builder()
                .name("Helsinki Vantaa Airport")
                .latitude(60.3172)
                .longitude(24.963301)
                .municipality("Helsinki")
                .iataCode("HEL")
                .build();
        createdAirports.add(airport08);
        Airport airport09 = Airport.builder()
                .name("Amsterdam Airport Schiphol")
                .latitude(52.308601)
                .longitude(4.76389)
                .municipality("Amsterdam")
                .iataCode("AMS")
                .build();
        createdAirports.add(airport09);
        Airport airport10 = Airport.builder()
                .name("Nagoya Airport / JASDF Komaki Air Base")
                .latitude(35.255759)
                .longitude(136.924095)
                .municipality("Nagoya")
                .iataCode("NKM")
                .build();
        createdAirports.add(airport10);
        Airport airport11 = Airport.builder()
                .name("Budapest Liszt Ferenc International Airport")
                .latitude(47.42976)
                .longitude(19.261093)
                .municipality("Budapest")
                .iataCode("BUD")
                .build();
        createdAirports.add(airport11);
        Airport airport12 = Airport.builder()
                .name("Hong Kong International Airport")
                .latitude(22.308901)
                .longitude(113.915001)
                .municipality("Hong Kong")
                .iataCode("HKG")
                .build();
        createdAirports.add(airport12);
        Airport airport13 = Airport.builder()
                .name("Kansai International Airport")
                .latitude(34.427299)
                .longitude(135.244003)
                .municipality("Osaka")
                .iataCode("KIX")
                .build();
        createdAirports.add(airport13);
        Airport airport14 = Airport.builder()
                .name("London Heathrow Airport")
                .latitude(51.4706)
                .longitude(-0.461941)
                .municipality("London")
                .iataCode("LHR")
                .build();
        createdAirports.add(airport14);
        Airport airport15 = Airport.builder()
                .name("Zürich Airport")
                .latitude(47.458056)
                .longitude(8.548056)
                .municipality("Zurich")
                .iataCode("ZRH")
                .build();
        createdAirports.add(airport15);
        Airport airport16 = Airport.builder()
                .name("Munich Airport")
                .latitude(48.353802)
                .longitude(11.7861)
                .municipality("Munich")
                .iataCode("MUC")
                .build();
        createdAirports.add(airport16);
        Airport airport17 = Airport.builder()
                .name("Narita International Airport")
                .latitude(35.764702)
                .longitude(140.386002)
                .municipality("Tokyo")
                .iataCode("NRT")
                .build();
        createdAirports.add(airport17);
        Airport airport18 = Airport.builder()
                .name("Incheon International Airport")
                .latitude(37.46910095214844)
                .longitude(126.45099639892578)
                .municipality("Seoul")
                .iataCode("ICN")
                .build();
        createdAirports.add(airport18);
        Airport airport19 = Airport.builder()
                .name("Singapore Changi Airport")
                .latitude(1.35019)
                .longitude(103.994003)
                .municipality("Singapore")
                .iataCode("SIN")
                .build();
        createdAirports.add(airport19);
        Airport airport20 = Airport.builder()
                .name("Tokyo Haneda International Airport")
                .latitude(35.552299)
                .longitude(139.779999)
                .municipality("Tokyo")
                .iataCode("HND")
                .build();
        createdAirports.add(airport20);
        Airport airport21 = Airport.builder()
                .name("Hamad International Airport")
                .latitude(25.273056)
                .longitude(51.608056)
                .municipality("Doha")
                .iataCode("DOH")
                .build();
        createdAirports.add(airport21);
        return createdAirports;
    }
}
