package control;

public class CalculadoraImc {

	public String calcularImc (Double peso, Double altura, Integer idade, String sexo){
		
		Double imc = peso/(altura*altura);
		String classificacaoEtaria = classificaFaixaEtaria(idade);
		
		switch (classificacaoEtaria) {
		case "ADULTO":
			if(imc<16){
				return "Baixo peso muito grave";
			}else if(imc>=16 && imc<=16.99){
				return "Baixo peso grave";
			}else if(imc>=17 && imc<=18.49){
				return "Baixo peso";
			}else if(imc>=18.50 && imc<=24.99){
				return "Peso normal";
			}else if(imc>=25 && imc<=29.99){
				return "Sobrepeso";
			}else if(imc>=30 && imc<=34.99){
				return "Obesidade grau I";
			}else if(imc>=35 && imc<=39.99){
				return "Obesidade grau II";
			}else if(imc>40){
				return "Obesidade grau III";
			}
			
			break;
		case "IDOSO":
			if("M".equalsIgnoreCase(sexo)){
				if(imc<21.9){
					return "Baixo peso";
				}else if(imc>=22 && imc<=27){
					return "Peso normal";
				}else if(imc>=27.1 && imc<=32){
					return "Sobrepeso";
				}else if(imc>=32.1 && imc<=37){
					return "Obesidade grau I";
				}else if(imc>=37.1 && imc<=41.9){
					return "Obesidade grau II";
				}else if(imc>42){
					return "Obesidade grau III (obesidade mórbida)";
				}
			}else{
				if(imc<21.9){
					return "Baixo peso";
				}else if(imc>=22 && imc<=27){
					return "Peso normal";
				}else if(imc>=27.1 && imc<=30){
					return "Sobrepeso";
				}else if(imc>=30.1 && imc<=35){
					return "Obesidade grau I";
				}else if(imc>=35.1 && imc<=39.9){
					return "Obesidade grau II";
				}else if(imc>40){
					return "Obesidade grau III (obesidade mórbida)";
				}
			}
			break;
		case "CRIANCA":
			if(imc<5){
				return "Baixo peso";
			}else if(imc>=5 && imc<=85){
				return "Peso normal";
			}else if(imc>=85 && imc<=95){
				return "Sobrepeso";
			}else if(imc>95){
				return "Obesidade";
			}
			break;	
		default:
			break;
		}
		return null;
		
	}

	private String classificaFaixaEtaria(Integer idade) {

		if(idade>=20 && idade<=65){
			return "ADULTO";
		}else if(idade>65){
			return "IDOSO";
		}else{
			return "CRIANCA";
		}
	}
}
