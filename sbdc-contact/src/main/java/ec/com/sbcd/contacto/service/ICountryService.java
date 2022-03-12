package ec.com.sbcd.contacto.service;

import ec.com.sbcd.contacto.model.Country;

import java.util.List;

public interface ICountryService {

    List<Country> findCountries();

    List<Country> findCountries(String name);
}
