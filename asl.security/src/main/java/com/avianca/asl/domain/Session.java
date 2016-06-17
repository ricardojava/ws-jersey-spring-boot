package com.avianca.asl.domain;

import java.io.Serializable;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

/**
 * 
 * @author CBYK - Ricardo Almeida
 * @since 16/06/2016
 * @version 1.0.0
 */
public class Session implements Serializable{

	private static final long serialVersionUID = 8661629808784155829L;
	private String idSession;
	LocalDateTime dateTimeAtual = LocalDateTime.now();
	private int minute;	
	
	
	public String getIdSession() {
		return idSession;
	}
	public Session() {		
		LocalDateTime dateTimeAtual = LocalDateTime.now();
		setMinute(dateTimeAtual.getMinute());
		
	}
	public void setIdSession(String idSession) {
		this.idSession = idSession;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public int getMinute() {
		return minute;
	}
	public void setMinute(int minute) {
		this.minute = minute;
	}
	
	

}

/*medir tempo de execução
Instant inicio = Instant.now();
rodaAlgoritmo();
Instant fim = Instant.now();
 
Duration duracao = Duration.between(inicio, fim);
long duracaoEmMilissegundos = duracao.toMillis();

//data para computadores
	Instant agora = Instant.now();
	//2014-04-08T10:02:52.036Z (formato ISO-8601)
	
	// data para humanos
	LocalDate hoje = LocalDate.now();
	//2014-04-08 (formato ISO-8601)
	 * 
	 * 
	 */
