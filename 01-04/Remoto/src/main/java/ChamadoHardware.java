public class ChamadoHardware  extends Chamado{
    private int equipamentoId;


    public ChamadoHardware(int id, String descricao, int equipamentoId) {
        super(id, descricao);
        this.equipamentoId = equipamentoId;
    }

    @Override
    public void solucionarChamado(){
        System.out.println("Chamado de Hardware resolvido: " + this.getDescricao() + " relacionado ao equipamento: " + equipamentoId);
        this.setStatus(Status.ENCERRADO);
    }

    public int getEquipamentoId() {
        return equipamentoId;
    }

    public void setEquipamentoId(int equipamentoId) {
        if (equipamentoId <= 0) {
            throw new IllegalArgumentException("O equipamentoId não pode ser nulo, vazio ou inválido (deve ser maior que zero).");
        }
        this.equipamentoId = equipamentoId;
    }
}
