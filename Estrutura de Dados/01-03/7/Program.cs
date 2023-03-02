int media, soma = 0, counter = 0, idade, salario;
string nome;

List<string> nomes = new List<string>();
List<int> idades = new List<int>();
List<int> salarios = new List<int>();

Console.Clear();

for (int i = 0; i < 10; i++)
{
    if (i < 5)
    {
        Console.WriteLine("Digite o " + (i + 1) + " nome:");
        nome = Console.ReadLine();

        Console.WriteLine("Digite a idade de " + nome + ":");
        idade = int.Parse(Console.ReadLine());

        Console.WriteLine("Digite o salario de " + nome + ":");
        salario = int.Parse(Console.ReadLine());

        nomes.Add(nome);
        idades.Add(idade);
        salarios.Add(salario);

        Console.Clear();

        soma = soma + salario;

        counter++;
    }
    else
    {
        Console.Write(nomes[i - 5] + " - ");
        Console.Write(idades[i - 5] + " anos - ");
        Console.WriteLine(salarios[i - 5] + " reais.");
    }
}

media = soma / counter;

Console.WriteLine();
Console.WriteLine("Média de salários: " + media);
Console.WriteLine();

for (int i = 0; i < 5; i++)
{
    if (salarios[i] > media)
    {
        Console.WriteLine("O salário de " + nomes[i] + " de " + salarios[i] + " é acima da média");
        Console.WriteLine();
    }
}

