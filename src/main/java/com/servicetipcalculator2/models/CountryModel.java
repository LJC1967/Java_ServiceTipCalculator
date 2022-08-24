package com.servicetipcalculator2.models;

public class CountryModel {
    //region VARIABLES
    private String _countryName;
    private int _minimumService;
    private int _maximumService;
    private String _currency;
    //endregion

    //region GETTERS AND SETTERS

    public String GetCountryName() {
        return _countryName;
    }

    public void SetCountryName(String _countryName) {
        this._countryName = _countryName;
    }

    public int GetMinimumService() {
        return _minimumService;
    }

    public void SetMinimumService(int _minimumService) {
        this._minimumService = _minimumService;
    }

    public int GetMaximumService() {
        return _maximumService;
    }

    public void SetMaximumService(int _maximumService) {
        this._maximumService = _maximumService;
    }

    public String GetCurrency() {
        return _currency;
    }

    public void SetCurrency(String _currency) {
        this._currency = _currency;
    }

    //endregion

    //region CONSTRUCTORS
    public CountryModel(String _countryName, int _minimumService, int _maximumService, String _currency) {
        this._countryName = _countryName;
        this._minimumService = _minimumService;
        this._maximumService = _maximumService;
        this._currency = _currency;
    }

    public CountryModel() {
        this._countryName = "";
        this._minimumService = 0;
        this._maximumService = 20;
        this._currency = "";
    }
    //endregion

    //region OVERRIDE METHODS
    @Override
    public String toString() {
        return GetCountryName();
    }
    //endregion
}
