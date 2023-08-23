package Controladores;


import java.sql.Connection;
import java.time.LocalDate;
import java.util.List;

import DAO.ReservaDAO;
import Factory.ConexionBase;
import modelo.Reserva;

public class ReservaControlador {
	
	private ReservaDAO reservaDAO;
	
	public ReservaControlador() {
		Connection con = new ConexionBase().conectarBase();
		this.reservaDAO = new ReservaDAO(con);	
	}
	
	public void guardar (Reserva reserva) {
		this.reservaDAO.guardar(reserva);
	}
	
	public List<Reserva> mostrar(){
		return this.reservaDAO.mostrar();
	}
	public List<Reserva> buscar(String id){
		return this.reservaDAO.buscarId(id);
	}
		
	public void actulizarReserva(LocalDate dataE, LocalDate dataS, String valor, String formaPago, Integer id) {
		this.reservaDAO.Actualizar(dataE, dataS, valor,formaPago, id);
	}
	
	public void Eliminar(Integer id) {
		this.reservaDAO.Eliminar(id);
	}

}
