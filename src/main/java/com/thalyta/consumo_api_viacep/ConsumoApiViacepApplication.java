package com.thalyta.consumo_api_viacep;

import java.io.IOException;

import com.thalyta.model.Address;
import com.thalyta.service.ViaCepService;

public class ConsumoApiViacepApplication {

	public static void main(String[] args) {
		ViaCepService vcs = new ViaCepService();

		try {

			Address address = vcs.getAddress("65300855");
			System.out.println(address.toString());

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}