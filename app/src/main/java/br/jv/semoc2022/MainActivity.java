package br.jv.semoc2022;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    List<Atividade> AtivList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);

        initData();
        initRecyclerView();
    }

    private void initRecyclerView() {
        AtividadeAdapter atividadeAdapter = new AtividadeAdapter(AtivList);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(atividadeAdapter);
    }

    private void initData() {
        AtivList = new ArrayList<>();
       AtivList.add(new Atividade("Apresentação",  "APRESENTAÇÃO\n" +
                "A Semana de Mobilização Científica – SEMOC – é uma atividade promovida anualmente pela Universidade Católica do Salvador (UCSAL), integrando a programação regular de atividades do calendário acadêmico desde 1998, sendo organizada e executada com a participação de todos os segmentos da comunidade acadêmica (docentes, discentes e funcionários), e já é uma tradição na cidade do Salvador. \n" +
                "\n" +
                "Dentre seus principais objetivos, a SEMOC pretende estimular e socializar as iniciativas no campo da pesquisa científica e da extensão desenvolvidas na Universidade, contribuir para a conscientização da comunidade acadêmica sobre a importância da integração entre ensino, pesquisa e extensão, promover o intercâmbio intra e interinstitucional em torno da produção do conhecimento e das ações comunitárias, e fomentar a difusão e o fortalecimento da diversidade científica no Estado da Bahia, como também no âmbito nacional e internacional.\n" +
                "\n" +
                "A série SEMOC tem gerado importantes desdobramentos para o fortalecimento da ambiência acadêmica, dentre os quais se inclui o estímulo à sensibilização e mobilização dos diversos segmentos da comunidade universitária, com repercussões na produção e socialização da pesquisa científica, no intercâmbio de atividades culturais, na articulação entre os campi e entre diferentes instituições e na criação e aprofundamento de redes nacionais e  internacionais.\n" +
                "\n" +
                "Neste já tradicional evento anual, docentes, discentes, funcionários, pesquisadores e comunidades realizam atividades diversas em torno das temáticas selecionadas, anualmente, que inclui conferências, mesas redondas, jornadas de pesquisa, debates, apresentações de trabalho, minicursos, oficinas e atividades culturais.\n" +
                "\n" +
                "A sucessão de temáticas centrais da série SEMOC demonstra um encadeamento lógico e tradutor do mérito privilegiado pela UCSal, circunscrito em preocupações explícitas com questões sociais e com princípios basilares de cunho universal, que articula-se, dessa forma, com a proposta pedagógica institucional, como, também, evidencia a tendência de colocar no centro dos debates temas de ampla abrangência científica e de abordagem interdisciplinar. \n" +
                "\n" +
                "A cultura institucional de integração das diferentes áreas do conhecimento alicerça o portfólio acadêmico da UCSal. Para a 25ª edição, a SEMOC traz como temática central “Educação Inclusiva”, que possibilita experienciar a indissociabilidade entre ensino, pesquisa e extensão e entre as grandes áreas do conhecimento:  Ciências Exatas e da Terra, Ciências Naturais, Engenharia / Tecnologia, Ciências da Saúde, Ciências Agrárias, Ciências Sociais, Ciências Humanas, Linguística, Letras e Artes. \n" +
                "\n" +
                "Este tema se sincroniza, assim, com a diretriz institucional de pautar agendas que privilegiam reflexões de relevância social, que sejam efetivas e inovadoras na perspectiva de soluções para problemas reais que afetam a vida humana, sempre enriquecidas por abordagens multidisciplinares, que abrangem as várias concepções de produção do conhecimento.\n" +
                "\n" +
                "COMISSÃO ORGANIZADORA E EXECUTIVA\n" +
                "Comitê Executivo \n" +
                "\n" +
                "Profa. Dra. Silvana Sá de Carvalho PPGTAS)\n" +
                "Profª Drª. Kátia Oliver (PPGPSC)\n" +
                "Prof Dr. Tagore Trajano (PPGD)\n" +
                "Profª. Drª.Liana Oliveira(PPGTAS)\n" +
                "Profª Drª. Sumaia Midlej (PPGFSC)\n" +
                "Prof. Dr. Moacir Tinôco (PPGTAS)\n" +
                "Matheus Oliveira (PPGPSC)\n" +
                "\n" +
                "Comitê de Organização\n" +
                "\n" +
                "Profª Léa Maria Bonfim Medeiros e Ana Cláudia Souza (Extensão)\n" +
                "Tatiana Oliveira e Chris Cerqueira (Assessoria de Comunicação – Ascom)\n" +
                "Lucas Peixinho (Administração Campus)\n" +
                "Linda Gomes (Biblioteca)\n" +
                "\n" +
                "Subcomitê por Eixo Temático\n" +
                "\n" +
                "Eixo 1: Profª Drª. Kátia Oliver – Coordenação do PPGPSC\n" +
                "\n" +
                "Eixo 2 : Prof Dr. Tagore Trajano – Coordenação do PPGD\n" +
                "\n" +
                "Eixo 3 :Profª. Drª. Maina Pirajá – Coordenação do PPGTAS\n" +
                "\n" +
                "Eixo 4 :Prof Dr. Tagore Trajano – Coordenação do PPGD\n" +
                "\n" +
                "Eixo 5 :Profª Drª. Sumaia Midlej – Coordenação do PPGFSC"));
        AtivList.add(new Atividade("Projeto", "A cultura institucional de integração das diferentes áreas do conhecimento alicerça o portfólio acadêmico da UCSal. Para a 25ª edição, a SEMOC traz como temática central “Educação Inclusiva”, que possibilita experienciar a indissociabilidade entre ensino, pesquisa e extensão e entre as grandes áreas do conhecimento:  Ciências Exatas e da Terra, Ciências Naturais, Engenharia / Tecnologia, Ciências da Saúde, Ciências Agrárias, Ciências Sociais, Ciências Humanas, Linguística, Letras e Artes. \n" +
                "\n" +
                "Este tema se sincroniza, assim, com a diretriz institucional de pautar agendas que privilegiam reflexões de relevância social, que sejam efetivas e inovadoras na perspectiva de soluções para problemas reais que afetam a vida humana, sempre enriquecidas por abordagens multidisciplinares, que abrangem as várias concepções de produção do conhecimento.\n" +
                "\n" +
                "Clique aqui para conhecer o projeto."));
        AtivList.add(new Atividade("Eixos temáticos", "Eixo 1: Racismo Ambiental, Refugiados Ambientais, Politícas Públicas e Inclusão Social\n" +
                "\n" +
                "Eixo 2 : Diversidade, Alteridade e Educação Inclusiva\n" +
                "\n" +
                "Eixo 3 : Povos Tradicionais e o Direito ao Território\n" +
                "\n" +
                "Eixo 4 : Educação Bioética e Direito Universal à Vida\n" +
                "\n" +
                "Eixo 5 : O Papel da Comunidade e da Família na Educação Inclusiva"));
        AtivList.add(new Atividade("Programação", "Confira a programação* que foi preparada neste ano:\n" +
                "\n" +
                "Mesas Redondas – Clique aqui!\n" +
                "\n" +
                "Jornada de Pesquisa – Clique aqui!\n" +
                "\n" +
                "Bate Papo – Clique aqui!\n" +
                "\n" +
                "Sessões Científicas – Clique aqui!\n" +
                "\n" +
                "SEMOC Jovem – Clique aqui!\n" +
                "\n" +
                "Lançamentos de livros – Clique aqui!\n" +
                "\n" +
                "*A programação poderá ser atualializada a qualquer momento."));
        AtivList.add(new Atividade("Inscrições", "INSCRIÇÕES\n" +
                "\n" +
                "Inscrições das atividades – Clique aqui!\n" +
                "\n" +
                "Inscrições para Lançamento de livros – Encerrada\n" +
                "\n" +
                "Inscrições para ser Monitor – Encerrada\n" +
                "\n" +
                "Inscrições de trabalhos científicos! Clique aqui – Encerrada\n" +
                "\n" +
                "Confira as normas de inscrição de artigo – Clique aqui!\n" +
                "Template de artigo – Clique aqui!\n" +
                "Inscrições para Pareceristas! Clique aqui – Encerrada\n" +
                "\n" +
                "Inscrições para Jornada de Pesquisa – Mesas de Pesquisa! Clique aqui – Encerrada"));
        AtivList.add(new Atividade("Cronograma ", "CRONOGRAMA FÍSICO\n" +
                "As atividades ocorrerão no campus Pituaçu. As atividades, abaixo, serão distribuídas entre todos os espaços, de maneira a que ocorram atividades durante os cinco dias previstos para acontecer a 25ª SEMOC.\n" +
                "\n" +
                " \n" +
                "\n" +
                "ATIVIDADES\t17/10\t18/10\t19/10\t20/10\t21/10\n" +
                "Credenciamento dos participantes\t   x\t\t\t\t\n" +
                "Aniversário da UCSAL – Missa\t\t   x\t\t\t   x\n" +
                "Abertura e Encerramento\t   x\t\t\t\t   x\n" +
                "Mesas redondas e Sessões Científicas \t\t   x\t   x\t   x\t\n" +
                "Jornadas Científicas\t\t   x\t   x\t   x\t\n" +
                "Festival de Música \t\t   x\t   x\t   x\t\n" +
                "Lançamento e Relançamento de livros\t\t   x\t   x\t   x\t\n" +
                "Seminário Lato Sensu\t\t   x\t   x\t   x\t\n" +
                "Espaço “Empresa Solidária”\t\t   x\t   x\t   x\t\n" +
                "SEMOC Jovem/Iniciação Científica\t\t\t\t   x\t\n" +
                "Premiação dos Melhores Artigos \t\t\t\t\t   x\n" +
                "Salão Interativo (Sessões Culturais, Exposições)\t\t   x\t   x\t   x\t   x\n "));
        AtivList.add(new Atividade(" Contatos","E-mail: semoc@ucsal.br\n" +
                "\n" +
                "Tel.: (71) 3206-7882 "));
        AtivList.add(new Atividade("Certificados","Em breve! "));
    }
}