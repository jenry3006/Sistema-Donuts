
   $(document).ready( function () {
    $('#tabela').DataTable();
} );


    $(document).ready(function(){
  $('#dataNascimento').mask('00/00/0000');
  $('#telefone').mask('(00) 00000-0000');
 })

    // Função para inicializar todos os popovers
function initializePopovers() {
    const popoverTriggerList = document.querySelectorAll('[data-bs-toggle="popover"]');
    const popoverList = [...popoverTriggerList].map(popoverTriggerEl => new bootstrap.Popover(popoverTriggerEl));
}

// 1. Inicializa os popovers quando a página carrega
document.addEventListener('DOMContentLoaded', function () {
    initializePopovers();
});

// 2. Inicializa os popovers toda vez que o DataTables redesenha a tabela
$('#tabela').on('draw.dt', function () {
    initializePopovers();
});
