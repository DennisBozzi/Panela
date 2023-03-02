int media, soma = 0, counter = 0, n;

List<int> numeros = new List<int>();

Console.WriteLine("Digite 999 para sair:");

for (int i = 0; i != 999; i++)
{

    Console.Write((i + 1) + " - ");
    n = int.Parse(Console.ReadLine());

    if (n == 999)
    {
        break;
    }
    else
    {

        numeros.Add(n);

        soma = soma + n;

        counter++;
    }

}

Console.Clear();

numeros.Sort();

media = soma / counter;

Console.WriteLine("Lista: " + string.Join(" - ", numeros));

Console.WriteLine();

Console.WriteLine("Média: " + media);

Console.WriteLine();