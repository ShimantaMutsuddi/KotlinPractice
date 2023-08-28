package com.chutyrooms.solid


interface Customer{
    fun isLoyelCustomer(): Boolean
}
class VehicleInsuranceCustomer:Customer {

    override fun isLoyelCustomer():Boolean{
        return true
    }
}
class HomeInsuranceCustomer:Customer  {

    override fun isLoyelCustomer():Boolean{
        return true
    }
}
class LifeInsuranceCustomer:Customer  {

    override fun isLoyelCustomer():Boolean{
        return true
    }
}

class InsuranceCompany{
    fun discountRate(customer: Customer):Int{
        return if(customer.isLoyelCustomer()) 38 else 12
    }

    /*fun discountRate(vehicleInsuranceCustomer: VehicleInsuranceCustomer):Int{
        return if (vehicleInsuranceCustomer.isLoyalCustomer()) 10 else 7
    }
    fun discountRate(homeInsuranceCustomer: HomeInsuranceCustomer):Int{
        return if (homeInsuranceCustomer.isLoyalCustomer()) 20 else 12
    }
    fun discountRate(lifeInsuranceCustomer: LifeInsuranceCustomer):Int{
        return if (lifeInsuranceCustomer.isLoyalCustomer()) 10 else 8
    }*/
}

fun main(){
    val lifeInsuranceCustomer=LifeInsuranceCustomer()
    val homeInsuranceCustomer=HomeInsuranceCustomer()
    val vehicleInsuranceCustomer=VehicleInsuranceCustomer()

    val insuranceCompany=InsuranceCompany()
    insuranceCompany.discountRate(lifeInsuranceCustomer)

}