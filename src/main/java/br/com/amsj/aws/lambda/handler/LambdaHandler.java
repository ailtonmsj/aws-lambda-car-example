package br.com.amsj.aws.lambda.handler;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import br.com.amsj.aws.lambda.dto.CarDtoInput;
import br.com.amsj.aws.lambda.dto.CarDtoOutput;

public class LambdaHandler implements RequestHandler<CarDtoInput, CarDtoOutput> {

	@Override
	public CarDtoOutput handleRequest(CarDtoInput carDtoInput, Context context) {

		context.getLogger().log("carDtoInput --> " + carDtoInput);

		CarDtoOutput carDtoOutput = new CarDtoOutput(carDtoInput);
		
		carDtoOutput.setDetails("The car color is " + carDtoInput.getColor());

		return carDtoOutput;
	}
}

/*
TO CONFIGURE LAMBDA
br.com.amsj.aws.lambda.handler.LambdaHandler::handleRequest

TO TESTE
{
	"name":"Toyota",
	"model":"Prius",
	"color":"Azul"
}


*/
