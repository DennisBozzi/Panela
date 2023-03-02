int media, soma = 0, counter = 0, idade;
string nome;

List<string> cachorros = new List<string>();
List<int> idades = new List<int>();

Console.Clear();

for (int i = 0; i < 10; i++)
{
    if (i < 5)
    {
        Console.WriteLine("Digite o " + (i + 1) + " nome:");
        nome = Console.ReadLine();

        Console.WriteLine("Digite a idade de " + nome + ":");
        idade = int.Parse(Console.ReadLine());

        cachorros.Add(nome);
        idades.Add(idade);

        Console.Clear();

        soma = soma + idade;

        counter++;
    }
    else {
        Console.Write(cachorros[i - 5] + " - ");
        Console.WriteLine(idades[i - 5] + " anos.");
    }
}

media = soma / counter;

Console.WriteLine();

Console.WriteLine("A médidade de idades: " + media + " anos.");

Console.WriteLine();