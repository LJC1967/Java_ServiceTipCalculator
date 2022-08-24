package com.servicetipcalculator2.models;

public class ServiceTipModel {
    //region VARIABLES
    private CountryModel _country;
    private double _billAmount;
    private int _servicePercentage;
    private double _serviceAmount;
    private double _totalAmount;
    //endregion

    //region GETTERS ANS SETTERS

    public CountryModel GetCountry() {
        return _country;
    }

    public void SetCountry(CountryModel _country) {
        this._country = _country;
    }

    public int GetServicePercentage() {
        return _servicePercentage;
    }

    public void SetServicePercentage(int _servicePercentage) {
        this._servicePercentage = _servicePercentage;
    }

    public double GetBillAmount() {
        return _billAmount;
    }

    public void SetBillAmount(double _billAmount) {
        this._billAmount = _billAmount;
    }

    public double GetServiceAmount() {
        return _serviceAmount;
    }

    public void SetServiceAmount(double _serviceAmount) {
        this._serviceAmount = _serviceAmount;
    }

    public double GetTotalAmount() {
        return _totalAmount;
    }

    public void SetTotalAmount(double _totalAmount) {
        this._totalAmount = _totalAmount;
    }
    //endregion

    //region CONSTRUCTORS

    public ServiceTipModel(CountryModel _country, double _billAmount, int _servicePercentage, double _totalAmount) {
        this._country = _country;
        this._billAmount = _billAmount;
        this._servicePercentage = _servicePercentage;
        this._totalAmount = _totalAmount;
    }

    public ServiceTipModel() {
        this._country = new CountryModel();
        this._billAmount = 0.0;
        this._servicePercentage = 0;
        this._totalAmount = 0.0;
    }
    //endregion

    //region PUBLIC METHODS
    //endregion
}
